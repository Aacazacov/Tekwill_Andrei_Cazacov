package homework_nr_2;

public class HomeworkNr2 {
    public static void main(String[] args) {

        System.out.println(); // пустая строка для раздельного отображения в консоли
        System.out.println("Hello World!");
        System.out.println(); // пустая строка

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float Pi = 3.14159F;

        System.out.println("CurrentWorldPopulation = " + CurrentWorldPopulation);
        System.out.println("CarsProducedThisYear = " + CarsProducedThisYear);
        System.out.println("FirstLetterInAlphabet is " + FirstLetterInAlphabet);
        System.out.println("JavaIsAmazing and it is " + JavaIsAmazing);
        System.out.println("Number Pi is " + Pi);
        System.out.println(); // пустая строка

        double Price = 7.99;
        double Tax = 0.25;
        int Quantity = 5;
        double Sum = 0;

        System.out.println("Price = " + Price + "$");
        System.out.println("Tax = " + Tax + "$");
        System.out.println("Quantity = " + Quantity + " pcs.");
        System.out.println("Sum = " + Sum + " ???");
        System.out.println(); // пустая строка

        double Total = Price + Tax * Quantity + Sum;
        System.out.println("Total: " + Total + " $");

    }

}
