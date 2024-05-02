/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author user
 */
public class üs_alma_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//RETURN:returnda int kullanılır.mainde sout kullanılır
                                             //VOİD:void te sout kullanılır
         System.out.println(üs_alma(2,3));                                   
    }
    static int üs_alma(int sayi1,int sayi2){
        int sonuc=1;
        for (int i = 1; i <= sayi2; i++) {
            sonuc*=sayi1;
            
        }
        return sonuc;
    }

}
