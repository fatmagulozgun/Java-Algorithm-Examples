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
public class seri11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //π/2=4/3,16/15,36/35,64/63...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int c = 1;
        for (int i = 1; i < n; i++) {
            int c1 = 4 * i * i;
            c = c * c1 / (c1 - 1);
        }
        System.out.print("sonuç:" + (2 * c));
    }
    
}
