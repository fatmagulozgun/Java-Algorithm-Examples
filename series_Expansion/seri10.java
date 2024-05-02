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
public class seri10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //π=12^1/2{1-1/(3*3)+1/(5*3^2)-1/(7*3^3)....}
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int t = 0;
        for (int i = 0; i < n - 1; i++) {
            t = t + (-1) ^ i / ((2 * i + 1) * 3 ^ i);
        }
        System.out.print("sonuç:"+((12) ^ (1 / 2) * t));
        
    }
    
}
