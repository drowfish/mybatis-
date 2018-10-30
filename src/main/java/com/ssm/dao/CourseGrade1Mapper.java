package com.ssm.dao;

import com.ssm.model.CourseGrade1;
import com.ssm.model.CourseGrade1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseGrade1Mapper {
    int countByExample(CourseGrade1Example example);

    int deleteByExample(CourseGrade1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseGrade1 record);

    int insertSelective(CourseGrade1 record);

    List<CourseGrade1> selectByExample(CourseGrade1Example example);

    CourseGrade1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseGrade1 record, @Param("example") CourseGrade1Example example);

    int updateByExample(@Param("record") CourseGrade1 record, @Param("example") CourseGrade1Example example);

    int updateByPrimaryKeySelective(CourseGrade1 record);

    int updateByPrimaryKey(CourseGrade1 record);
}