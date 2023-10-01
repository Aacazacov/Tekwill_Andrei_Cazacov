package homework_nr_7;

public abstract class Person {
    String name;
    String surName;

    public Person(String name, String surName) {
       this.name = name;
       this.surName = surName;
    }
    public void printMyName() {
        System.out.println("The name of person is " + name + " " + surName);
    }
}
