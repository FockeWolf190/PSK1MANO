package ryanwizz.usecases.mybatis.model;

public class FlightPassenger {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.FLIGHT_PASSENGER.FLIGHT_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    private Integer flightId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.FLIGHT_PASSENGER.PASSENGER_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    private Integer passengerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.FLIGHT_PASSENGER.FLIGHT_ID
     *
     * @return the value of PUBLIC.FLIGHT_PASSENGER.FLIGHT_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public Integer getFlightId() {
        return flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.FLIGHT_PASSENGER.FLIGHT_ID
     *
     * @param flightId the value for PUBLIC.FLIGHT_PASSENGER.FLIGHT_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.FLIGHT_PASSENGER.PASSENGER_ID
     *
     * @return the value of PUBLIC.FLIGHT_PASSENGER.PASSENGER_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public Integer getPassengerId() {
        return passengerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.FLIGHT_PASSENGER.PASSENGER_ID
     *
     * @param passengerId the value for PUBLIC.FLIGHT_PASSENGER.PASSENGER_ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }
}