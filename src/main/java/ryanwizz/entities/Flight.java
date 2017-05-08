package ryanwizz.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "FLIGHT")
@NamedQueries({
        @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f"),
        @NamedQuery(name = "Flight.findById", query = "SELECT f FROM Flight f WHERE f.id = :id"),
        @NamedQuery(name = "Flight.findByDepart", query = "SELECT f FROM Flight f WHERE f.depart LIKE :depart"),
        @NamedQuery(name = "Flight.findByArrive", query = "SELECT f FROM Flight f WHERE f.arrive LIKE :arrive")
})
@Getter
@Setter
//@EqualsAndHashCode(of = "registrationNo")
@ToString(of = {"id", "depart", "arrive"})
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(min = 3, max = 3)
    @Column(name = "DEPART")
    private String depart;

    @Size(min = 3, max = 3)
    @Column(name = "ARRIVE")
    private String arrive;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @JoinTable(name = "FLIGHT_PASSENGER", joinColumns = {
            @JoinColumn(name = "FLIGHT_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
            @JoinColumn(name = "PASSENGER_ID", referencedColumnName = "ID")})

    @ManyToMany
    private List<Passenger> passengerList = new ArrayList<>();

    @JoinColumn(name = "PLANE_ID", referencedColumnName = "ID")
    @ManyToOne
    private Plane plane;

}
