package com.ssm.dao;

import com.ssm.model.CourseGrade2;
import com.ssm.model.CourseGrade2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseGrade2Mapper {
    int countByExample(CourseGrade2Example example);

    int deleteByExample(CourseGrade2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseGrade2 record);

    int insertSelective(CourseGrade2 record);

    List<CourseGrade2> selectByExample(CourseGrade2Example example);

    CourseGrade2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseGrade2 record, @Param("example") CourseGrade2Example example);

    int updateByExample(@Param("record") CourseGrade2 record, @Param("example") CourseGrade2Example example);

    int updateByPrimaryKeySelective(CourseGrade2 record);

    int updateByPrimaryKey(CourseGrade2 record);
}