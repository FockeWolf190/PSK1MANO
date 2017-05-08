package ryanwizz.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "PLANE")
@NamedQueries({
        @NamedQuery(name = "Plane.findAll", query = "SELECT p FROM Plane p"),
        @NamedQuery(name = "Plane.findById", query = "SELECT p FROM Plane p WHERE p.id = :id")})
@Getter
@Setter
@EqualsAndHashCode(of = "name")
@ToString(of = {"id", "name", "year"})

public class Plane implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    @Column(name = "YEAR")
    private Integer year;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @OneToMany(mappedBy = "plane")
    private List<Flight> flightList = new ArrayList<>();


}

