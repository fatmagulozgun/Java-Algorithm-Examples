package Loops;

import java.util.Scanner;

public class armstrong_sayı_olup_olmadığı {

    public static void main(String[] args) {
        //(4^3)+ (0^3)+(7^3) = 64+0+343 = 407
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir:");
        int sayi = sc.nextInt();
        int basamaksayisi = 0;
        int toplam = 0;
        int rakam;
        int gecici = sayi;
        int gecici2 = sayi;

        while (sayi > 0) {
            gecici /= 10;
            basamaksayisi++;
        }
        while (sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, basamaksayisi);
            sayi /= 10;
        }
        if (toplam == gecici2) {
            System.out.println(gecici2 + "sayisi armstrong syaıdır");

        } else {
            System.out.println("armstrong değidlir");
        }
    }

}
