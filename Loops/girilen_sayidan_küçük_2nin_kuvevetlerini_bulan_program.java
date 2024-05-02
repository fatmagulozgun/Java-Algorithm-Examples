package Loops;

import java.util.Scanner;

public class girilen_sayidan_küçük_2nin_kuvevetlerini_bulan_program {

    public static void main(String[] args) {
        //girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdırma
        //2^0=1 2^1=2 2^2=4 2^3=8... 
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = sc.nextInt();
        for (int i = 1; i <= sayi; i*=2) {
            System.out.println(sayi+"ya kadar olan"+"2nin kuvvetleri:"+i);
            
        }
    }

}
