package Examples2;

import java.util.Scanner;

public class Nkadar_tek_sayılarıntoplamıÇarpımı_çift_sayılarınkareleritoplamı {

    public static void main(String[] args) {
        int toplam = 0;
        int carpım = 1;
        int ktop = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısını girin");
        int sayi = scan.nextInt();
        int i = 1;
        while (i <= sayi) {
            if (i % 2 != 0) {

                toplam = toplam + i;
                carpım *= i;
            } else {
                ktop = i * i;
                ktop += i;
            }

            i++;

        }

        System.out.println("tek:" + toplam);
        System.out.println("tek çarpımları:" + carpım);
        System.out.println("çiftlerin kareleri toplamı:" + ktop);
    }
}
