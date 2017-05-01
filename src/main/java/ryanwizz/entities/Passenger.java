package ryanwizz.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marius on 5/1/2017.
 */
@Entity
@Table(name = "PASSENGER")
@NamedQueries({
        @NamedQuery(name = "Passenger.findAll", query = "SELECT p FROM Passenger p"),
        @NamedQuery(name = "Passenger.findById", query = "SELECT p FROM Passenger p WHERE p.id = :id"),
        @NamedQuery(name = "Passenger.findByFirstName", query = "SELECT p FROM Passenger p WHERE p.firstName LIKE :firstName"),
        @NamedQuery(name = "Passenger.findByLastName", query = "SELECT p FROM Passenger p WHERE p.lastName LIKE :lastName"),
        @NamedQuery(name = "Passenger.findByCountry", query = "SELECT p FROM Passenger p WHERE p.country LIKE :country")
})
@Getter
@Setter
//@EqualsAndHashCode(of = "registrationNo")
@ToString(of = {"id", "firstName", "lastName", "country"})
public class Passenger implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(min = 3, max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Size(min = 3, max = 20)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "COUNTRY")
    private String country;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @ManyToMany
    private List<Flight> flightList = new ArrayList<>();


}
