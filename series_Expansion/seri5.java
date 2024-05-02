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
public class seri5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("n sayısını gir");
        int sayi=scan.nextInt();
        
        double toplam=0;
        for (int k = 1; k <= sayi; k++) {
            int k_faktr=1;
            for (int j = 1; j <=k; j++) {
                k_faktr*=j;
                
            }
            toplam+=(double)k/k_faktr;
            
        }
        System.out.println(toplam);
    }
    
}
