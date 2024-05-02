
package Loops;

import java.util.Scanner;

public class yildizlar_ile_elmas_yapma {

    //         *      2b 1y      
    //        ***     1b 3y       3satir
    //       *****    0b 5y                             SANKİ İKİ ÜÇGEN VARMIŞ GİBİ 
    //        ***     1b 3y       3satir
    //         *      2b 1y
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("satır sayisi giriniz: ");
        int satir = input.nextInt();
        int bosluk = satir - 1;
        int yildiz = 1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            bosluk--;
            yildiz = yildiz + 2;
        }

        yildiz = yildiz - 4;
        bosluk = 1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            bosluk++;
            yildiz = yildiz - 2;

        }
    }
}
