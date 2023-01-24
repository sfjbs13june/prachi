package com.prachi.app.model;

public class Student {

    String rollno;
    String name;
    String std;
    String school;

    public Student(String rollno, String name, String std, String school) {
        this.rollno = rollno;
        this.name = name;
        this.std = std;
        this.school = school;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


}
