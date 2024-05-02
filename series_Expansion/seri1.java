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
public class seri1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n sayısını gir");
        int sayi = scan.nextInt();
        double toplam=0;
        for (int i = 0; i <= sayi; i++) {
            int alt_taraf=2*i+1; 
            double fakt=1;
            for (int j = 1; j <= alt_taraf; j++) {
                fakt*=j;
            }
          toplam+=(double)(alt_taraf+1)/fakt;  
          
        }
        System.out.println(toplam);
    }
    

}
    
    

