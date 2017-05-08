package ryanwizz.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import ryanwizz.entities.Passenger;
import ryanwizz.entities.Flight;
import ryanwizz.usecases.cdi.dao.PassengerDAO;
import ryanwizz.usecases.cdi.dao.FlightDAO;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerJPA {

    @Getter
    private Passenger passenger = new Passenger();
    @Getter
    private Flight flight = new Flight();

    @Inject
    private PassengerDAO passengerDAO;
    @Inject
    private FlightDAO flightDAO;

    @Transactional
    public void createFlightPassenger() {
        flight.getPassengerList().add(passenger);
        passenger.getFlightList().add(flight);
        passengerDAO.create(passenger);
        flightDAO.create(flight);
        log.info("Maybe OK...");
    }

    public List<Flight> getAllFlights() {
        return flightDAO.getAllFlights();
    }
}
