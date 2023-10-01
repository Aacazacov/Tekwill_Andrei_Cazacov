package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {

        int[] numbers = new int[101];
        for (int i = 0; i <= 100; i++) {
            numbers[i] = 100 - i;
            System.out.println(numbers[i]);
        }
        System.out.println("----------");

        int sum = 0;
        double multiply = 1;
        for (int j = 0; j != numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                sum += numbers[j];
            } else {
                multiply *= numbers[j];
            }
        }
        System.out.println("Сумма всех четных чисел массива = " + sum);
        System.out.println("Произведение всех нечетных чисел массива = " + multiply);
        System.out.println("----------");

        int[] copyNumbers = new int[numbers.length];
        for (int k = 0; k < numbers.length; k++) {
            copyNumbers[k] = numbers[k];
            System.out.println(copyNumbers[k]);
        }

    }

}
