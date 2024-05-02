
package Loops;

import java.util.Scanner;

public class girilen_sayiya_kadar_4ve5in_kuvevetlerini_yazma {

    public static void main(String[] args) {
        // girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazma
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi girin");
        sayi = sc.nextInt();
        int sayac = 0;
        int sayac2 = 0;

        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(4 + " ^ " + sayac + " = " + i);
            sayac++;
        }
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println(5 + " ^ " + sayac2 + " = " +j);
            sayac2++;
        }
    }

}
