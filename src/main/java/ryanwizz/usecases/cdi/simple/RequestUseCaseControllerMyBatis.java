package ryanwizz.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import ryanwizz.usecases.mybatis.dao.FlightMapper;
import ryanwizz.usecases.mybatis.dao.FlightPassengerMapper;
import ryanwizz.usecases.mybatis.dao.PassengerMapper;
import ryanwizz.usecases.mybatis.model.Flight;
import ryanwizz.usecases.mybatis.model.FlightPassenger;
import ryanwizz.usecases.mybatis.model.Passenger;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerMyBatis {

    @Getter
    private Flight flight = new Flight();

    @Getter
    private Passenger passenger = new Passenger();

    @Inject
    private FlightMapper flightMapper;
    @Inject
    private PassengerMapper passengerMapper;
    @Inject
    private FlightPassengerMapper flightPassengerMapper;

    public List<ryanwizz.usecases.mybatis.model.Flight> getAllFlights() {
        return flightMapper.selectAll();
    }

    @Transactional
    public void createFlightPassenger() {
        flightMapper.insert(flight);
        passengerMapper.insert(passenger);
        FlightPassenger flightPassenger = new FlightPassenger();
        flightPassenger.setFlightId(flight.getId());
        flightPassenger.setPassengerId(passenger.getId());
        flightPassengerMapper.insert(flightPassenger);
        log.info("Maybe OK...");
    }
}
