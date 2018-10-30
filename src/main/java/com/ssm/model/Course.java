package com.ssm.model;

public class Course {
    private Integer id;

    private String coursename;

    private String coursedesc;

    private String courseteacher;

    private String coursetype;

    private Integer secondid;

    private byte[] courseimg;

    public Course(Integer id, String coursename, String coursedesc, String courseteacher, String coursetype, Integer secondid, byte[] courseimg) {
        this.id = id;
        this.coursename = coursename;
        this.coursedesc = coursedesc;
        this.courseteacher = courseteacher;
        this.coursetype = coursetype;
        this.secondid = secondid;
        this.courseimg = courseimg;
    }

    public Course() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public void setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc == null ? null : coursedesc.trim();
    }

    public String getCourseteacher() {
        return courseteacher;
    }

    public void setCourseteacher(String courseteacher) {
        this.courseteacher = courseteacher == null ? null : courseteacher.trim();
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype == null ? null : coursetype.trim();
    }

    public Integer getSecondid() {
        return secondid;
    }

    public void setSecondid(Integer secondid) {
        this.secondid = secondid;
    }

    public byte[] getCourseimg() {
        return courseimg;
    }

    public void setCourseimg(byte[] courseimg) {
        this.courseimg = courseimg;
    }
}