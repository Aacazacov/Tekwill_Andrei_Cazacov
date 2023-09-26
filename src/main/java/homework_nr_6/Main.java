package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Employee number1 = new Employee("Victor", 28, "Transport");
        Employee number2 = new Employee("Alexandr", 39, "Finance");
        Employee number3 = new Employee("Serghei", 26, "Service");
        System.out.println(number1.getDepartment());
        System.out.println(number2.getAge());
        System.out.println(number3.getName());
        System.out.println("----------");
        number2.setAge(26);
        number2.setName("Yurii");
        System.out.println(number2.getName() + " " + number2.getAge() + " " + number2.getDepartment());
        System.out.println("----------");

        Invoice iPhone10 = new Invoice("Apple", "iPhone 10", 5, 452.1);
        iPhone10.getAmount();
        System.out.println("----------");

        Date test = new Date(17,6,23);
        test.dispalyDate();
        test.setDate(25);
        test.setMonth(2);
        test.setYear(23);
        test.dispalyDate();
    }
}
