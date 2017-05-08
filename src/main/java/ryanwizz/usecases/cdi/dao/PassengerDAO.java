package ryanwizz.usecases.cdi.dao;

import ryanwizz.entities.Passenger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class PassengerDAO {
    @Inject
    private EntityManager em;

    public void create(Passenger passenger) {
        em.persist(passenger);
    }
}
