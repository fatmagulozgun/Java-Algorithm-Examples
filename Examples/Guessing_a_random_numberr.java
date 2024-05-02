package Examples;

import java.util.Random;
import java.util.Scanner;

public class Guessing_a_random_numberr {

    public static void main(String[] args) {
        //bilgisayarın ürettiği 1 ile 99 arasında rastgele bir sayıyı tahmin etme oyununu
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int rastgele = rd.nextInt(99) + 1; // 1-99 arası rastgele sayı üret
        int sayac = 0;

        while (true) {
            System.out.print("Lütfen 1-99 arasında bir sayı tahmini gir: ");
            int tahmin = scan.nextInt();
            sayac++;

            if (tahmin < 1 || tahmin > 99) {
                System.out.println("1-99 arasında bir değer girin.");
            } else if (tahmin < rastgele) {
                System.out.println("Daha büyük bir değer girin.");
            } else if (tahmin > rastgele) {
                System.out.println("Daha küçük bir değer girin.");
            } else {
                System.out.println("Doğru tahmin!");
                break;
            }
        }

        System.out.println("Random sayı: " + rastgele);
        System.out.println("Deneme sayısı: " + sayac);

        
    }}
