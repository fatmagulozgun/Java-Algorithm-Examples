package Examples;

import java.util.Random;
import java.util.Scanner;

public class Random_letter_guessing_game_in_10_tries {

    public static void main(String[] args) {
        //bilgisayarın ürettiği rastgele büyük harfi en fazla 10 denemede tahmin etme oyunu
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        char rastgele = (char) (rd.nextInt(26) + 'A');
        int sayac = 0;

      

        while (sayac < 10) {
            System.out.print("Tahmininiz: ");
            char tahmin = scan.next().charAt(0);
            sayac++;

            if (tahmin < 'A' || tahmin > 'Z') {
                System.out.println("Lütfen sadece büyük harfleri kullanın.");
                continue;
            }

            if (tahmin < rastgele) {
                System.out.println("Daha büyük bir harf girin.");
            } else if (tahmin > rastgele) {
                System.out.println("Daha küçük bir harf girin.");
            } else {
                System.out.println("Tebrikler! Doğru harfi tahmin ettiniz: " + rastgele);
                break;
            }
        }

        if (sayac == 10) {
            System.out.println("Üzgünüm, 10 tahmin hakkınız doldu. Doğru harf: " + rastgele);
        }
    }

}
