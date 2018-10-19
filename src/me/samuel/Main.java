package me.samuel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ArrayList<Person> personList = new ArrayList<>();
	ArrayList<Education> educationList = new ArrayList<>();
	ArrayList<Experience> experienceList = new ArrayList<>();
	ArrayList<Skill> skillList = new ArrayList<>();

	String response = "";
	byte numberChoice = 0;
	byte choice = 0;
    String competency = "";

    Person aPerson = new Person();
    Education anEducation = new Education();
    Experience anExperience = new Experience();
    Skill aSkill = new Skill();
    aPerson.addAnEducation(anEducation);
    aPerson.addAnExperience(anExperience);
    aPerson.addASkill(aSkill);
    anEducation.setPerson(aPerson);
    anExperience.setPerson(aPerson);
    aSkill.setPerson(aPerson);

	Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Robo-Resumé.");

        do{
            System.out.println("\nSelect an option number to continue: \n1. Enter your name and contact information" +
                "\n2. Enter your educational background \n3. Enter your previous and current job experience " +
                "\n4. Enter your skills and competency level \n5. Display your name and contact information " +
                "\n6. Display your educational background \n7. Display your previous and current job experience " +
                "\n8. Display your skills and competency level \n9. Display your current resumé \n10. Quit the program");
            numberChoice = keyboard.nextByte();
            keyboard.nextLine();

            switch (numberChoice){
                case 1:
                    System.out.println("You have selected: Enter your name and contact information.");

                    System.out.println("\n\nEnter your first name: ");
                    aPerson.setFirstName(keyboard.nextLine());
                    System.out.println("Enter your last name: ");
                    aPerson.setLastName(keyboard.nextLine());
                    System.out.println("Enter your email address: ");
                    aPerson.setEmail(keyboard.nextLine());
                    System.out.println("Enter your phone number: ");
                    aPerson.setPhone(keyboard.nextLine());
                    personList.add(new Person(aPerson.getFirstName(),
                            aPerson.getLastName(), aPerson.getEmail(), aPerson.getPhone()));
                    break;

                case 2:
                    System.out.println("You have selected: Enter your educational background.");

                    do{
                        System.out.println("\n\nEnter the name of your school:");
                        anEducation.setSchool(keyboard.nextLine());
                        System.out.println("Enter your year of graduation: ");
                        anEducation.setYear(keyboard.nextLine());
                        System.out.println("Enter your degree: ");
                        anEducation.setDegree(keyboard.nextLine());
                        System.out.println("Enter your major: ");
                        anEducation.setMajor(keyboard.nextLine());
                        educationList.add(new Education(anEducation.getSchool(), anEducation.getYear(),
                            anEducation.getDegree(), anEducation.getMajor()));
                        aPerson.addAnEducation(anEducation);
                        anEducation.setPerson(aPerson);
                        System.out.println("Would you like to enter another education background? ");
                        response = keyboard.nextLine();
                    }while (response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"));
                    break;

                case 3:
                    System.out.println("You have selected: Enter previous and current job experience. ");

                    do{
                        System.out.println("Enter the name of your company: ");
                        anExperience.setCompany(keyboard.nextLine());
                        System.out.println("Enter your job title at this company: ");
                        anExperience.setTitle(keyboard.nextLine());
                        System.out.println("Enter your starting date at this job: ");
                        anExperience.setStartDate(keyboard.nextLine());
                        System.out.println("Are you currently still at this job? ");
                        response = keyboard.nextLine();
                            if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y")){
                                anExperience.setEndDate("Present");
                            }
                            else{
                                System.out.println("Enter your ending date at this job: ");
                                anExperience.setEndDate(keyboard.nextLine());
                            }
                        System.out.println("Write one sentence that describes your duties at this job: ");
                        anExperience.setDescription(keyboard.nextLine());
                        experienceList.add(new Experience(anExperience.getCompany(), anExperience.getTitle(),
                            anExperience.getStartDate(), anExperience.getEndDate(), anExperience.getDescription()));
                        aPerson.addAnExperience(anExperience);
                        anExperience.setPerson(aPerson);
                        System.out.println("Would you like to enter another job experience? ");
                        response = keyboard.nextLine();
                    }while(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"));
                    break;

                case 4:
                    System.out.println("You have selected: Enter your skills and competency level. ");

                    do{
                        System.out.println("Enter your skill: ");
                        aSkill.setSpecificSkill(keyboard.next());
                        System.out.println("\nSelect the number option that best describes your competency level: " +
                                "\n1.Fundamental \n2.Novice \n3.Intermediate \n4.Advanced");
                        choice = keyboard.nextByte();

                        switch(choice){
                            case 1:
                                System.out.println("You have selected: Fundamental.");
                                aSkill.setCompetency("Fundamental");
                                break;
                            case 2:
                                System.out.println("You have selected: Novice.");
                                aSkill.setCompetency("Novice");
                                break;
                            case 3:
                                System.out.println("You have selected: Intermediate.");
                                aSkill.setCompetency("Intermediate");
                                break;
                            case 4:
                                System.out.println("You have selected: Advanced.");
                                aSkill.setCompetency("Advanced");
                                break;
                            default:
                                System.out.println("Please enter a valid number option.");
                                break;
                        }
                        skillList.add(new Skill(aSkill.getSpecificSkill(), aSkill.getCompetency()));
                        aPerson.addASkill(aSkill);
                        aSkill.setPerson(aPerson);
                        System.out.println("\nWould you like to enter another skill? \n");
                        response = keyboard.next();
                    }while(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"));
                    break;

                case 5:
                    System.out.println("You have selected: Display your contact info.");
                    for (Person person : personList){
                        System.out.printf("\nFirst Name: %s\nLast Name: %s\nEmail Address: %s\nPhone Number: %s",
                                person.getFirstName(), person.getLastName(), person.getEmail(), person.getPhone());
                    }
                    break;

                case 6:
                    System.out.println("You have selected: Display your educational background. ");
                    for (Education education : educationList){
                        System.out.printf("\nSchool: %s\nYear of Graduation: %s\nDegree: %s\nMajor: %s",
                                education.getSchool(), education.getYear(), education.getDegree(), education.getMajor());
                    }
                    break;

                case 7:
                    System.out.println("You have selected: Display your previous and current job experience. ");
                    for (Experience experience : experienceList){
                        System.out.printf("\nCompany: %s\nTitle: %s\nDate: %s - %s\nDescription: %s",
                                experience.getCompany(), experience.getTitle(), experience.getStartDate(),
                                experience.getEndDate(), experience.getDescription());
                    }
                    break;

                case 8:
                    System.out.println("You have selected: Display your skills and competency level. ");
                    for (Skill skill : skillList){
                        System.out.printf("\nSkill: %s\nCompetency: %s", skill.getSpecificSkill(), skill.getCompetency());
                    }
                    break;

                //Revisit this. This is just a temporary solution.
                //Use enhanced for loop to display resumes here.
                case 9:
                    System.out.println("You have selected: Display your current resumé. \n" +
                            "\n============================");

                    for(Person eachPerson:personList) {
                        System.out.printf("%s %s's Resume: \n\n", eachPerson.getFirstName(), eachPerson.getLastName());
                        System.out.println("Contact Information: \n\n");
                        System.out.printf("%s %s\n%s \n%s \n\n",
                                eachPerson.getFirstName(), eachPerson.getLastName(), eachPerson.getEmail(), eachPerson.getPhone());
                    }
                        System.out.println("Education: \n\n");
                        for(Education eachEducation : educationList){
                            System.out.printf("%s, %s\n%s in %s\n\n",
                                eachEducation.getSchool(), eachEducation.getYear(), eachEducation.getDegree(), eachEducation.getMajor());
                        }
                        System.out.println("Experience: \n\n");
                        for(Experience eachExperience : experienceList){
                            System.out.printf("%s \n%s, %s - %s\n -%s\n\n",
                                eachExperience.getTitle(), eachExperience.getCompany(), eachExperience.getStartDate(),
                                eachExperience.getEndDate(), eachExperience.getDescription());
                        }
                        System.out.println("Skill Set: \n\n");
                        for(Skill eachSkill : skillList){
                            System.out.printf("%s, %s\n\n", eachSkill.getSpecificSkill(), eachSkill.getCompetency());
                    }
                    System.out.println("\n=============================");
                    break;

                case 10:
                    System.out.println("You have selected: Quit the program. ");
                    break;

                default:
                    System.out.println("Please select a valid number option. ");
                    break;
            }
        }while(numberChoice!=10);
    }
}