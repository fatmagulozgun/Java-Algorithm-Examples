package Examples2;

import java.util.Scanner;

public class burc_bulan_program {

    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("hangi ayda doğdunuz sayi ile söyleyin");
        int ay = sc.nextInt();
        System.out.println("doğduğun gün:");
        int gün = sc.nextInt();
        switch (ay) {
            case 1:
                if (gün < 22) {
                    System.out.println("oğlak");
                } else {
                    System.out.println("kova");
                }
                break;
            case 2:
                if (gün < 19) {
                    System.out.println("kova");
                } else {
                    System.out.println("balık");
                }
                break;
            case 3:
                if (gün < 20) {
                    System.out.println("balık");
                } else {
                    System.out.println("koç");
                }
                break;
            case 4:
                if (gün < 20) {
                    System.out.println("koç");
                } else {
                    System.out.println("boğa");
                }
                break;
            case 5:
                if (gün < 21) {
                    System.out.println("boğa");
                } else {
                    System.out.println("ikizler");
                }
                break;
            case 6:
                if (gün < 20) {
                    System.out.println("ikizler");
                } else {
                    System.out.println("yengeç");
                }
                break;
            case 7:
                if (gün < 20) {
                    System.out.println("yengeç");
                } else {
                    System.out.println("aslan");
                }
                break;
            case 8:
                if (gün < 20) {
                    System.out.println("aslan");
                } else {
                    System.out.println("başak");
                }
                break;
            case 9:
                if (gün < 20) {
                    System.out.println("başak");
                } else {
                    System.out.println("terazi");
                }
                break;
            case 10:
                if (gün < 20) {
                    System.out.println("terazi");
                } else {
                    System.out.println("akrep");
                }
                break;
            case 11:
                if (gün < 20) {
                    System.out.println("akrep");
                } else {
                    System.out.println("yay");
                }
                break;
            case 12:
                if (gün < 20) {
                    System.out.println("yay");
                } else {
                    System.out.println("oğlak");
                }
                break;
            case 13:
                if (gün < 20) {
                    System.out.println("oğlak");
                } else {
                    System.out.println("kova");
                }
                break;
            case 14:
                if (gün < 20) {
                    System.out.println("kova");
                } else {
                    System.out.println("balık");
                }
                break;
            default:
                System.out.println("lütfen 1-12 arasında bir sayı giriniz geçersiz sayı girdiniz");

        }
    }

}
