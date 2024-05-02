package Loops;

import java.util.Scanner;

public class girilen_sayiya_kadar_olan_sayılardan_3ve4e_bölünen {

    public static void main(String[] args) {
        //0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int ort = 0;
        int top = 0;
        int sayac = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir:");
        int sayi = sc.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sayac++;//kaç tane sayı olduğunu hesaplamak için 
                top = top + i;

            }
        }
        ort = top / sayac;
        System.out.println("ortalama:" + ort);
    }

}
