package ryanwizz.usecases.cdi.dao;

import ryanwizz.entities.Flight;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class FlightDAO {
    @Inject
    private EntityManager em;

    public void create(Flight flight) {
        em.persist(flight);
    }

    public List<Flight> getAllFlights() {
        return em.createNamedQuery("Flight.findAll", Flight.class).getResultList();
    }
}
