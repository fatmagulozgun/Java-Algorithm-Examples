package Examples;

import java.util.Scanner;

public class Prime_factors_of_integers {

    public static void main(String[] args) {
        // klavyeden girilen 1 den büyük tamsayının asal çarpanlarını bulan program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı girin (1'den büyük): ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Lütfen 1'den büyük bir tamsayı girin.");
            return;
        }

        System.out.print("Asal çarpanlar: ");
        findPrimeFactors(number);
    }

    // Asal çarpanları bulan fonksiyon
    public static void findPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }

}
