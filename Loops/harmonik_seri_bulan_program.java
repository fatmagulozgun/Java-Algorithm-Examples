package Loops;

import java.util.Scanner;

public class harmonik_seri_bulan_program {

    public static void main(String[] args) {
        // 1+(1/2)+(1/3)+(1/4).. +(1/n)
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir:");
        int sayi = sc.nextInt();
        int hesap=0;
        for (int i = 1; i <=sayi; i++) {
           hesap+= 1/i;
        }
        System.out.println("sonuc"+hesap);
    }

}
