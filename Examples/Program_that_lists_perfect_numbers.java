package Examples;

public class Program_that_lists_perfect_numbers {

    public static void main(String[] args) {
        //mükemmel sayıların listesini veren program
        int upperLimit = 10000; // Belirli bir üst sınır

        System.out.println("Mükemmel sayılar:");

        for (int i = 1; i <= upperLimit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }

}
