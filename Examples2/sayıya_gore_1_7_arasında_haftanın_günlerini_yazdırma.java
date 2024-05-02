
package Examples2;

import java.util.Scanner;

public class sayıya_gore_1_7_arasında_haftanın_günlerini_yazdırma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("lütfen 1 ile 7 arasında bir sayı giriniz");
            int sayi = scan.nextInt();
            if (sayi == 1) {
                System.out.println("pazartesi");
            } else if (sayi == 2) {
                System.out.println("salı");
            } else if (sayi == 3) {
                System.out.println("çarşamba");
            } else if (sayi == 4) {
                System.out.println("perşembe");
            } else if (sayi == 5) {
                System.out.println("cuma");
            } else if (sayi == 6) {
                System.out.println("cumartesi");
            } else if (sayi == 7) {
                System.out.println("pazar");
            } else if (sayi > 7 || sayi < 1) {
                System.out.println("yanlış sayı girildi.1-7arasında olmalı");
            }
        }

    }
}

    

