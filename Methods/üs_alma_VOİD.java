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
public class üs_alma_VOİD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//RETURN:return da int kullanılır.Mainde sout kullanılır
                                            //VOİD:void te sout kullanılır
        üs_alma(2, 3);
    }

    static void üs_alma(int say1, int say2) {
        int hesap = 1;
        for (int i = 1; i <= say2; i++) {
            hesap *= say1;
        }
        System.out.println("sonuç:" + hesap);
    }

}

    

