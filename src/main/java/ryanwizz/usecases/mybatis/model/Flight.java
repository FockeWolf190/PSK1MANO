package ryanwizz.usecases.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Flight {

    private Integer id;
    private String depart;
    private String arrive;
    private Integer planeId;

    private List<Passenger> passengers;
    private Plane plane;
}