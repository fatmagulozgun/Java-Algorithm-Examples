package Examples;

import java.util.Scanner;

public class Finding_twin_prime_numbers {

    public static void main(String[] args) {
        // iki asal sayı arasındaki fark 2 ise bunlara ikiz asallar denir buna göre klavyden girilen üst sınıra kadar olan ikiz asalların listesini veren program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üst sınırı girin: ");
        int upperLimit = scanner.nextInt();

        System.out.println("İkiz asal sayılar:");
        for (int i = 2; i <= upperLimit - 2; i++) {
            if (isTwinPrime(i, i + 2)) {
                System.out.println(i + " ve " + (i + 2));
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // İkiz asal sayı kontrolü
    public static boolean isTwinPrime(int num1, int num2) {
        return isPrime(num1) && isPrime(num2);
    }

}
