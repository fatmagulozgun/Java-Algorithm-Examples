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
public class seri9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //e=2k+2/(2k+1)!  k=0 dan başlıyor sonsuza kadar gidiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double t=2;
        for (int i = 1; i < n;) {
            int fakt=(2*i+1);
            t=t+(2*i+2)/fakt;
        }
         System.out.print("sonuç:"+t);
    }
    
}
