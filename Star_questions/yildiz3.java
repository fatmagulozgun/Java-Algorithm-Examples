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
public class yildiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*    *
             ***
            *****          2 ÜÇGEN VARMIŞ GİBİ
             ***
              * 
        */
        int satir = 3;
        int yildiz = 1;
        int bosluk = satir - 1;

        for (int k = 0; k < satir; k++) {// kaç tane satır olacağının foru 

            for (int s = 0; s < bosluk; s++) {//boslugun foru
                System.out.print(" ");
            }

            for (int s = 0; s < yildiz; s++) {//yıldızın foru
                System.out.print("*");
            }

            System.out.println();
            bosluk--;
            yildiz = yildiz + 2;            
        }  
        


                                            //       *
                                            //      ***
                                            //     *****
        yildiz = yildiz - 4;                //    ******* devam etseydi 4.satir hep +2 eklendiği için 7 yıldızlı olacaktı burası 7 yildizli değil 3 yildizli olacak o yüzden -4 yapıyoruz
        bosluk = 1;                         //     _***   4 yildiz silinir 1 tanede boşluk olur 
                                            //       *    

        for (int k = 0; k < satir - 1; k++) {// kaç tane satır olacağının foru 

            for (int s = 0; s < bosluk; s++) {//boslugun foru
                System.out.print(" ");
            }

            for (int s = 0; s < yildiz; s++) {//yıldızın foru
                System.out.print("*");
            }
            System.out.println();
            bosluk++;
            yildiz = yildiz - 2;
        }

    }
}
