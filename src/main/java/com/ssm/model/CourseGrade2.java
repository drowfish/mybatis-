package com.ssm.model;

public class CourseGrade2 {
    private Integer id;

    private String name;

    private Integer firstid;

    public CourseGrade2(Integer id, String name, Integer firstid) {
        this.id = id;
        this.name = name;
        this.firstid = firstid;
    }

    public CourseGrade2() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFirstid() {
        return firstid;
    }

    public void setFirstid(Integer firstid) {
        this.firstid = firstid;
    }
}