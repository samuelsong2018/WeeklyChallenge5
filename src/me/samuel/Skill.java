package me.samuel;

import java.util.ArrayList;

public class Skill {
    private String specificSkill;
    private String competency;

    private Person person;

    public Skill(){

    }

    public Skill(String specificSkill, String competency){
        this.specificSkill = specificSkill;
        this.competency = competency;
    }

    public String getSpecificSkill() {
        return specificSkill;
    }

    public void setSpecificSkill(String specificSkill) {
        this.specificSkill = specificSkill;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPerson (ArrayList<Person> person){

    }
}
