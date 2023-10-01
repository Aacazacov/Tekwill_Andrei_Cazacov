package homework_nr_7;

public class Manager extends Employee{
    int teamSize;
    String teamName;

    public Manager(String name, String surName, String companyName, int teamSize, String teamName) {
        super(name, surName, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("Manager take care for reports of team " + teamName + " consisting of " + teamSize + " employees.");
    }
}
