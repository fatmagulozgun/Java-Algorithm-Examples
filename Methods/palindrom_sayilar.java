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
public class palindrom_sayilar {

    public static void main(String[] args) { 
        //ÖRNEK:121,12321,45654     
        //BOOLEAN:true yada false sonuçta evet palindromdur hayır değildir çıkacağı için boolen kullanıldı
        //BOLLEAN RETURN'a örnektir!!!
        System.out.println(palindrom(35653));
    }

    static boolean palindrom(int sayimiz) {
        int geçiciSayi = sayimiz;
        int tersSayi = 0;
        int kalan;
        while (geçiciSayi != 0) {
            kalan = geçiciSayi % 10;
            tersSayi = (tersSayi * 10) + kalan;
            geçiciSayi /= 10;
        }
        if (sayimiz == tersSayi) {
            return true;
        } else {
            return false;
        }
       // geçicisayi=247 kalan=7 terssayi=7 ile başlar
       // geçicisayi=24 kalan=4 terssayi=74 ile başlar
       // geçicisayi=2 kalan=2 terssayi=742 ile başlar
    }

}
