/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star_questions;

/**
 *
 * @author user
 */
public class yildiz6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* * * * * * * * * *    9Y 0B
            * * * * * * *      7Y 1B
              * * * * *        5Y 2B       5 SATIR
                * * *          3Y 3B
                  *            1Y 4B
    
         */
        int satir = 5;
        int yildiz = 9;
        int bosluk = satir - 5;

        for (int k = 0; k < satir; k++) {// kaç tane satır olacağının foru 

            for (int s = 0; s < bosluk; s++) {//boslugun foru
                System.out.print(" ");
            }

            for (int s = 0; s < yildiz; s++) {//yıldızın foru
                System.out.print("*");
            }

            System.out.println();
            yildiz = yildiz - 2;
            bosluk++;
        }
    }
}
