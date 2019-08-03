package com.endava.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;


public class Student {
    @NotBlank(message = "You need to put a name!")
    private String name;
    @NotBlank(message = "You need to put a Surname!")
    private String surname;
    private String middleName;
    @NotBlank(message = "I need to know where do you study!")
    private String school;
    @Max(value = 666666, message = "Index can not be larger than 666666")
    @NotBlank(message = "Tell me your index!")
    private String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }


}
