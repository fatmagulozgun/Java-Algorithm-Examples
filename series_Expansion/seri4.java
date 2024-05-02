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
public class seri4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını gir");
        int sayi = scan.nextInt();
        double toplam = 0;
        for (int i = 2; i <= sayi; i += 2) {
            int alt_taraf = i - 1;
            double fak = 1;
            for (int j = 1; j <= alt_taraf; j++) {
                fak *= j;
            }
            toplam += i / fak;
        }
        System.out.println(toplam);
    }

}
