/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star_questions;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class kare_şeklinde_yıldız {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        do {
            System.out.print("Lütfen satır sayısı giriniz:");
            row = input.nextInt();
        } while (row < 0 || row % 2 == 0);

        int col = row;
        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == row) {//ilk veya son satır ise
                for (int j = 1; j <= col; j++)//ROW SÜTÜNDUR
                {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= col; j++) {
                    if (j == 1 || j == col) {//ilk sütün veya son sutün ise
                        System.out.print("*");
                    } else { //aradaki sütunlar ise
                        System.out.print(" ");

                    }

                }
            }
            System.out.println();
        }

    }

}
