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
public class seri6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1-x^2/2!+x^4/4
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int sayi = scan.nextInt();
        double fakt = 1;
        double toplam = 0;
        for (int i = 0; i < sayi - 1; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                fakt *= j;
                toplam = toplam + ((-1) ^ i) * (sayi ^ (2 * i)) / fakt;
            }
        }
        System.out.print(toplam);
    }
}
