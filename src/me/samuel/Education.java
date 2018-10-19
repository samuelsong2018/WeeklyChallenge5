package me.samuel;

import java.util.ArrayList;

public class Education {
    private String school;
    private String year;
    private String degree;
    private String major;

    private Person person;

    //Constructor.
    public Education(){

    }

    //Instantiating Education object.
    public Education(String school, String year, String degree, String major){
        this.school = school;
        this.year = year;
        this.degree = degree;
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPerson(ArrayList<Person> person){

    }
}
