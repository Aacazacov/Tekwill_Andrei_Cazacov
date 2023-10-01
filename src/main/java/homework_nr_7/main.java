package homework_nr_7;

public class main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Andrei", "Petrov", "Star IT", 5, "Developers");
        Programmer p1 = new Programmer("Vasily", "Kuznetsov", "Star IT", "JAVA", 2);
        Manager f1 = new Manager("Yurii", "Lapshin", "IT Solutions",10, "WebTest");
        Programmer b1 = new Programmer("Igor", "Ivanov","BIG Test", "Pascal",4);

        m1.work();
        b1.work();
        System.out.println("------------------------");

        f1.printMyName();
        p1.printMyName();
        System.out.println("------------------------");

        Person[] a1 = new Person[]{m1, p1, f1, b1};
        for (int index = 0; index != a1.length; index++){
            System.out.println("The name of person is " + a1[index].name + " " + a1[index].surName);
        }
        System.out.println("------------------------");
        for (int index = 0; index != a1.length; index++) {
            if (a1[index] instanceof Manager tempObject) {
                tempObject.work();
                System.out.println("This person is " + a1[index].name + " " + a1[index].surName);
                System.out.println();
            }
        }
    }
}
