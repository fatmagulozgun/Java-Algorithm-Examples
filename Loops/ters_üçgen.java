/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package döngüler;

/**
 *
 * @author user
 */
public class ters_üçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  *******************     0b 19y
        //   *****************      1b 17y
        //    ***************
        //     *************
        //      ***********                          10 satırlı
        //       *********
        //        *******
        //         *****
        //          ***
        //           *
        
        int bosluk=0;
        int yildiz=19;
        int satir=10;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            bosluk++;
            yildiz=yildiz-2;
        }
    }
    
}
