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
public class yildiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    /*  *--------   1Y 
        ***------   3Y     5 SATIR
        *****----   5Y   !!Boşluğu yazmamaıza gerek yok çünkü sol tarfata boşluk yok 
        *******--   7Y   
        *********   9Y                  
         */
        int satir = 5;

        int yildiz = satir - 4;

        for (int k = 0; k < satir; k++) {

            for (int s = 0; s < yildiz; s++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz = yildiz + 2;
        }
    }
}
