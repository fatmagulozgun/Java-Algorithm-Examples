package Examples;

import java.util.Scanner;

public class Prime_numbers_up_to_the_upper_limit {

    public static void main(String[] args) {
        //kullanıcıdan alınan üst sınıra kadar olan asal sayıları hesapla
        Scanner input = new Scanner(System.in);
        System.out.print("Üst sınırı girin: ");
        int N = input.nextInt();
        System.out.println("\nAsal Sayılar:");

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
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
}

