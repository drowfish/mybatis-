package com.ssm.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@Namespace("/")
@ParentPackage("struts-default")
public class Index extends ActionSupport{
    public Index(){
        System.out.println("我是Index");
    }
    @Action(value = "test",results={
            @Result(name="success",location = "/test.jsp")
    })
    public String test(){
        System.out.println("test");
        return SUCCESS;
    }

}
