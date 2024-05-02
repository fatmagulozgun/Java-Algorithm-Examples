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
public class özyineli_metodlar_ile_asal_sayilar_bulma {

    public static boolean asalMi(int sayi, int a) {
        if (a == 1) {
            return true;
        } else if (sayi % a == 0) {
            return false;
        } else {
            return asalMi(sayi, a - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);          ???????????????????????????????????????????????*
        System.out.print("Sayı girin: ");
        int sayi = sc.nextInt();

        if (asalMi(sayi, sayi / 2)) {
            System.out.println(sayi + " ASAL");
        } else {
            System.out.println(sayi + " ASAL DEĞİL");
        }
    }
}

