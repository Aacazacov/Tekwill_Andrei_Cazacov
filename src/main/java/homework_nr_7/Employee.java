package homework_nr_7;

public abstract class Employee extends Person {
    String companyName;

    public abstract void work();

    public Employee(String name, String surName, String companyName) {
        super(name, surName);
        this.companyName = companyName;
    }


}
