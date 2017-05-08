package ryanwizz.usecases.cdi.conversation;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import ryanwizz.entities.Passenger;
import ryanwizz.entities.Flight;
import ryanwizz.usecases.cdi.dao.PassengerDAO;
import ryanwizz.usecases.cdi.dao.FlightDAO;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Named
@ConversationScoped
@Slf4j
public class ConversationUseCaseControllerCdi implements Serializable {

    private static final String PAGE_INDEX_REDIRECT = "conversation-cdi?faces-redirect=true";

    private enum CURRENT_FORM {
        CREATE_PASSENGER, CREATE_FLIGHT, CONFIRMATION
    }

    @Inject
    private EntityManager em;

    @Inject
    @Getter
    private Conversation conversation;

    @Inject
    private PassengerDAO passengerDAO;
    @Inject
    private FlightDAO flightDAO;

    @Getter
    private Passenger passenger = new Passenger();
    @Getter
    private Flight flight = new Flight();

    private CURRENT_FORM currentForm = CURRENT_FORM.CREATE_PASSENGER;
    public boolean isCurrentForm(CURRENT_FORM form) {
        return currentForm == form;
    }

    /**
     * The first conversation step.
     */
    public void createPassenger() {
        conversation.begin();
        currentForm = CURRENT_FORM.CREATE_FLIGHT;
    }

    /**
     * The second conversation step.
     */
    public void createFlight() {
        flight.getPassengerList().add(passenger);
        passenger.getFlightList().add(flight);
        currentForm = CURRENT_FORM.CONFIRMATION;
    }

    /**
     * The last conversation step.
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public String ok() {
        try {
            passengerDAO.create(passenger);
            flightDAO.create(flight);
            em.flush();
            Messages.addGlobalInfo("Success!");
        } catch (OptimisticLockException ole) {
            // Other user was faster...
            Messages.addGlobalWarn("Please try again");
            log.warn("Optimistic Lock violated: ", ole);
        } catch (PersistenceException pe) {
            // Some problems with DB - most often this is programmer's fault.
            Messages.addGlobalError("Finita la commedia...");
            log.error("Error ending conversation: ", pe);
        }
        Faces.getFlash().setKeepMessages(true);
        conversation.end();
        return PAGE_INDEX_REDIRECT;
    }

    /**
     * The last (alternative) conversation step.
     */
    public String cancel() {
        conversation.end();
        return PAGE_INDEX_REDIRECT;
    }

    public List<Flight> getAllFlights() {
        return flightDAO.getAllFlights();
    }
}
