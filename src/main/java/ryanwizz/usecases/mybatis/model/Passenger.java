package ryanwizz.usecases.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Passenger {

    private Integer id;

    private String firstName;

    private String lastName;

    private String country;

}