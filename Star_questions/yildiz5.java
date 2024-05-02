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
public class yildiz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* * * * * *    5Y
       * * * * -    4Y  
       * * * - -    3Y         5 SATIRLI BOŞLUK SATIEI YAZMA 
       * * - - -    2Y
       * - - - -    1Y 
        
         */

        int satir = 5;

        int yildiz = satir;

        for (int k = 0; k < satir; k++) {

            for (int s = k; s < yildiz; s++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
