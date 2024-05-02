package random_questions;

import java.util.Random;
import java.util.Scanner;

public class BilgisayarınÜrettiği1ile99ArasıSayıTahminEdilmeOyunu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        int rastgele = rd.nextInt(100);
        int sayac = 1;
        System.out.print("lütfen 1-99 arasında bir tahmin girin");
        int tahmin = scan.nextInt();
        while (true) {
            if (tahmin < 1 || tahmin > 99) {
                System.out.println("lütfen belirtilen aralıkta gir");
                tahmin = scan.nextInt();
            } else if (tahmin < rastgele) {
                System.out.println("daha büyük bir değer gir");
                tahmin = scan.nextInt();
                sayac++;
            } else if (tahmin > rastgele) {
                System.out.println("daha küçük bir değer gir");
                tahmin = scan.nextInt();
                sayac++;
            } else if (tahmin == rastgele) {
                System.out.println("doğru");
            }
            System.out.println("Random sayı:" + rastgele);
            System.out.println("deneme sayınız:" + sayac);
            break;
        }
    }
}
