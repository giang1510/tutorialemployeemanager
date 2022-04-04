package com.fixeo.tutorialemployeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNr;
    private String imgUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee() {}

    public Employee(Long id, String name, String email, String jobTitle, String phoneNr, String imgUrl, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phoneNr = phoneNr;
        this.imgUrl = imgUrl;
        this.employeeCode = employeeCode;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
