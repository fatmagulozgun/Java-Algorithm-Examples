package Loops;

import java.util.Scanner;

public class Tek_Sayıların_Toplamını {

    public static void main(String[] args) {
        // TEK SAYILARIN TOPLAMINI BULAN PROGRAM

        int toplam = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("sayi gir:");
        int sayi = sc.nextInt();

        for (int j = 0; j < sayi; j++) {//girilen sayıya kadar olduğu için for kullanıldı
            if (j % 2 == 1) {
                toplam += j;
            }
        }
        System.out.println("toplam:" + toplam);
    }

}
