package Examples;

import java.util.Scanner;

public class Finding_friendly_numbers {

    public static void main(String[] args) {
//klavyeden girilen iki tam sayının dost sayılar olup olmadığını tespit eden program
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk tam sayıyı girin: ");
        int number1 = scanner.nextInt();
        System.out.print("İkinci tam sayıyı girin: ");
        int number2 = scanner.nextInt();

        if (areAmicableNumbers(number1, number2)) {
            System.out.println(number1 + " ve " + number2 + " dost sayılardır.");
        } else {
            System.out.println(number1 + " ve " + number2 + " dost sayılar değildir.");
        }
    }

    // İki sayının dost sayılar olup olmadığını kontrol eden fonksiyon
    public static boolean areAmicableNumbers(int number1, int number2) {
        int sumOfDivisors1 = sumOfProperDivisors(number1);
        int sumOfDivisors2 = sumOfProperDivisors(number2);

        return (sumOfDivisors1 == number2) && (sumOfDivisors2 == number1);
    }

    // Bir sayının tam bölenlerinin toplamını hesaplayan fonksiyon
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
