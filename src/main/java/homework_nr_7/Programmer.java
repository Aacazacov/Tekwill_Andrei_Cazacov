package homework_nr_7;

public class Programmer extends Employee{
    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String name, String surName, String companyName, String programmingLanguage, int yearsOfExperience) {
       super(name, surName, companyName);
       this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println("The programmer that use programming language " + programmingLanguage
                + " can solve difficult tasks start from " + yearsOfExperience + " years of experience");

    }
}
