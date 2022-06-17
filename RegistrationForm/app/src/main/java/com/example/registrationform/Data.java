package com.example.registrationform;

public class Data {

    public Data(String name, Long regNo, Long mobNo, String gender) {
        this.name = name;
        this.regNo = regNo;
        this.mobNo = mobNo;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Long getRegNo() {
        return regNo;
    }

    public Long getMobNo() {
        return mobNo;
    }

    String name;


    public String getGender() {
        return gender;
    }

    String gender;
    Long regNo;
    Long mobNo;
}
