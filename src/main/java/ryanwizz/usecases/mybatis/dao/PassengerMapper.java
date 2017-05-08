package ryanwizz.usecases.mybatis.dao;

import ryanwizz.usecases.mybatis.model.Passenger;

import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper

public interface PassengerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int insert(Passenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    Passenger selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    List<Passenger> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PASSENGER
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int updateByPrimaryKey(Passenger record);
}