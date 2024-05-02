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
public class seri8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1/2+1/12+1/30+1/56+1/90...
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double toplam = 0;
        for (int i = 0; i < n - 1; i++) {
            toplam = toplam + 1 / ((2 * i + 1) * (2 * i + 2));
        }
        System.out.println(toplam);
    }
    
}
