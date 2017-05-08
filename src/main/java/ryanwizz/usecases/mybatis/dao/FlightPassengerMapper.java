package ryanwizz.usecases.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import ryanwizz.usecases.mybatis.model.FlightPassenger;

import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper

public interface FlightPassengerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int deleteByPrimaryKey(@Param("flightId") Integer flightId, @Param("passengerId") Integer passengerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int insert(FlightPassenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.FLIGHT_PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    List<FlightPassenger> selectAll();
}