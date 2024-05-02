package Loops;

import java.util.Scanner;

public class girilen_ismi_klavyeden_istenen_kadar_altALta_yazdırma {

    public static void main(String[] args) {
        String isim;
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi girin");
        isim = scan.nextLine();
        System.out.println("İsminizi kaç defa yazdırmak istersiniz");
        int sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++) {
            System.out.println(isim);
        }

    }
}
