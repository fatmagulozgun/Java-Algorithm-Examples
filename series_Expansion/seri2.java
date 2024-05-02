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
public class seri2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını gir");
        int sayi = scan.nextInt();
        double toplam = 0;
        for (int i = 0; i < sayi; i++) {
            toplam += (double) Math.pow(-1, i) / (2 * i + 1);//math pow üs alma işlemidir
        }
        toplam = 4 * toplam;

        System.out.println(toplam);
    }

}
