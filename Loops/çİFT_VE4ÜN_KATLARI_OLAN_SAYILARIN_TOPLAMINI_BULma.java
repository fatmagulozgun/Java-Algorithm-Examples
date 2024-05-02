package Loops;

import java.util.Scanner;

public class çİFT_VE4ÜN_KATLARI_OLAN_SAYILARIN_TOPLAMINI_BULma {

    public static void main(String[] args) {
        //tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan zincirleri toplama
        Scanner sc = new Scanner(System.in);
        int sayi;
        int top=0;
        do {
            System.out.println("çift sayi giriniz");
            sayi = sc.nextInt();
            if(sayi%2==0&&sayi%4==0){
            top+=sayi;
            }
        } while (sayi > 0);//girilene kdar girişleri kabul eden dediği için do while kullanıldı 
        //çünkü çift sayı girin sorusunu bir kaç defa sorması için do while
        System.out.println("toplam:"+top);
    }
}
