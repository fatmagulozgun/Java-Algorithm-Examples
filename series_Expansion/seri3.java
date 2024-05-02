/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series_Expansion;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class seri3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını gir");
        int sayi = scan.nextInt();
        double toplam = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                toplam += (double) 1 / (2 * i + 1);
            } else {
                toplam -= (double) 1 / (2 * i + 1);
            }
        }
        toplam = 4 * toplam;
        System.out.println(toplam);
    }

}
