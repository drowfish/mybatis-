package com.ssm.model;

public class Video {
    private Integer id;

    private String videodesc;

    private String videoid;

    private Integer thirdid;

    public Video(Integer id, String videodesc, String videoid, Integer thirdid) {
        this.id = id;
        this.videodesc = videodesc;
        this.videoid = videoid;
        this.thirdid = thirdid;
    }

    public Video() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideodesc() {
        return videodesc;
    }

    public void setVideodesc(String videodesc) {
        this.videodesc = videodesc == null ? null : videodesc.trim();
    }

    public String getVideoid() {
        return videoid;
    }

    public void setVideoid(String videoid) {
        this.videoid = videoid == null ? null : videoid.trim();
    }

    public Integer getThirdid() {
        return thirdid;
    }

    public void setThirdid(Integer thirdid) {
        this.thirdid = thirdid;
    }
}