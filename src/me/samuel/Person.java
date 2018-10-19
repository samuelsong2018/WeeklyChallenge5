package me.samuel;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    //1 to many: one person has many degrees, experiences, and skills.
    private ArrayList<Education> educations;
    private ArrayList<Experience> experiences;
    private ArrayList<Skill> skills;

    //Constructor.
    public Person(){
        educations = new ArrayList<>();
        experiences = new ArrayList<>();
        skills = new ArrayList<>();
    }

    //This step identifies the variables that comprise the object Person.
    public Person(String firstName, String lastName, String email, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        educations = new ArrayList<>();
        experiences = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public void addAnEducation(Education anEducation){
        educations.add(anEducation);
    }

    public void addAnExperience(Experience anExperience){
        experiences.add(anExperience);
    }

    public void addASkill(Skill aSkill){
        skills.add(aSkill);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experience> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}


