package ryanwizz.usecases.mybatis.model;



public class Plane {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLANE.ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLANE.NAME
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLANE.YEAR
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    private Integer year;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLANE.ID
     *
     * @return the value of PUBLIC.PLANE.ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLANE.ID
     *
     * @param id the value for PUBLIC.PLANE.ID
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLANE.NAME
     *
     * @return the value of PUBLIC.PLANE.NAME
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLANE.NAME
     *
     * @param name the value for PUBLIC.PLANE.NAME
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLANE.YEAR
     *
     * @return the value of PUBLIC.PLANE.YEAR
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public Integer getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLANE.YEAR
     *
     * @param year the value for PUBLIC.PLANE.YEAR
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}