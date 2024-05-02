package Loops;

import java.util.Scanner;

public class dowhile_ile_girilen_sayı_0100arasında_olsun {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        do {

            System.out.println("lütfen sayı girin");
            sayi = scan.nextInt();
        } while (sayi < 0 || sayi > 100);

        System.out.println("sayınız:" + sayi);

    }

}
