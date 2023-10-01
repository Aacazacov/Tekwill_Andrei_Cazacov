package homework_nr_7;

public abstract class Pensioned extends Person {
    String retireDate;
    int age;

    public Pensioned(String name, String surName, String retireDate, int age) {
        super(name, surName);
        this.retireDate = retireDate;
        this.age = age;
    }
}
