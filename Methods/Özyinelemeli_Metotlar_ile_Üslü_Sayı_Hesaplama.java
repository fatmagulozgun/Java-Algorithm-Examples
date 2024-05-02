/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Özyinelemeli_Metotlar_ile_Üslü_Sayı_Hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//RETURN:return da int kullanılır.Main de sout kullanılır.Özyineleme return kullanılır
        //Java dili, taban ve üs değerleri kullanıcıdan alınan üs alma işlemi " Recursive " metot kullanarak yapan programını yürütür.
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri girin: ");
        int taban = sc.nextInt();
        System.out.print("Üs değeri girin: ");
        int us = sc.nextInt();
        System.out.println(usAlma(taban, us));

    }

    static int usAlma(int taban, int üs) {
        if (üs == 0) {
            return 1;
        } else if (üs == 1) {
            return taban;
        } else {
            return taban * usAlma(taban, üs - 1);
        }
    }
}
