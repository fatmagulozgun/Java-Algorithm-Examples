package Examples2;

import java.util.Scanner;

public class klavyedenGirilenBirSayınınYineKlavyedenİstenenYüzdesiniHesaplama {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Yüzdesi hesaplanacak sayıyı giriniz:");
        int sayi = klavye.nextInt();

        System.out.println("Yüzde oranını giriniz:");
        double yuzde = klavye.nextDouble();
        double sonuc = sayi * (yuzde / 100);
        System.out.println(sonuc);
    }

}