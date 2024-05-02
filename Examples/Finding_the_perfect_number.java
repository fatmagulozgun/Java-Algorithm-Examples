package Examples;

import java.util.Scanner;

public class Finding_the_perfect_number {

    public static void main(String[] args) {
        //klayeden girilen bir tamsayının mükemmel sayı olup olmadığını test eden program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

}
