package ryanwizz.usecases.mybatis.dao;

import ryanwizz.usecases.mybatis.model.Plane;

import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper

public interface PlaneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLANE
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLANE
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int insert(Plane record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLANE
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    Plane selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLANE
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    List<Plane> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PLANE
     *
     * @mbg.generated Mon May 08 16:04:12 EEST 2017
     */
    int updateByPrimaryKey(Plane record);
}