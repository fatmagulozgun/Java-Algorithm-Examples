package Examples2;

import java.util.Scanner;

public class A_tamsayısınınTamBölenleriniHesaplama {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bölenlerini bulmak istediğiniz sayıları yazın");
        int sayi = klavye.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
            }

        }

    }

}
