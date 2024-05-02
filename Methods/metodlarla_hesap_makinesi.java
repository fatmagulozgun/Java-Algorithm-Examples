package Methods;

import java.util.Scanner;

public class metodlarla_hesap_makinesi {

    public static void main(String[] args) {//RETURN:returnda int kullanılır.main içinde sout olur
        // VOİD:voidte sout kullanılır
        Scanner sc = new Scanner(System.in);
        int secim;
        String menü = "1-toplama\n"
                + "2-çıkarma\n"
                + "3-çarpma\n"
                + "4-bölme\n"
                + "5-üslü sayi hesaplama\n"
                + "6-mod alma\n"
                + "7-dikdörtgen alan ve çevre hesabı\n"
                + "8-çıkış\n";
        System.out.println(menü);
        while (true) {
            System.out.println("bir işlem seçiniz");
            secim = sc.nextInt();
            
            if (secim == 0) {
                break;
            }
            System.out.println("ilk sayi:");
            int sayi1 = sc.nextInt();
            System.out.println("ikinci sayi:");
            int sayi2 = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("toplam sonucu:"+toplam(sayi1, sayi2));
                    break;
                case 2:
                     System.out.println("çıkarma sonucu:"+çıkarma(sayi1, sayi2));
                    break;
                case 3:
                     System.out.println("çarpma sonucu:"+çarpma(sayi1, sayi2));
                    break;
                case 4:
                     System.out.println("bölme sonucu:"+bölme(sayi1, sayi2));
                    break;
                case 5:
                     System.out.println("üs alma sonucu:"+üs_alma(sayi1, sayi2));
                    break;
                case 6:
                     System.out.println("mod sonucu:"+mod_alma(sayi1, sayi2));
                    break;
                case 7:
                     alan_cevre(sayi1, sayi2);
                    break;
                default:
                    System.out.println("gecersiz sayi girildi1");
            }

        }

    }

    static int toplam(int sayi1, int sayi2) {
        int sonuc=sayi1+sayi2;       
        return sonuc;
    }

    static int çıkarma(int sayi1, int sayi2) {
        int sonuc= sayi1 - sayi2;
        return sonuc;
    }

    static int çarpma(int sayi1, int sayi2) {
       int sonuc= sayi1 *sayi2;
        return sonuc;
    }

    static int bölme(int sayi1, int sayi2) {
        if (sayi2 == 0) {
            System.out.println("ikinci sayı 0 dan farklı olmalı");
            return 0;
        } else {
            int sonuc=sayi1/sayi2;
            return sonuc;
        }
    }

    static int üs_alma(int sayi1, int sayi2) {
        int sonuc = 1;
        for (int i = 1; i <= sayi2; i++) {
            sonuc *= sayi1;
        }       
        return sonuc;
    }

    static int mod_alma(int sayi1, int sayi2) {
        int sonuc= sayi1 %sayi2;
        return sonuc;
    }

    //static int alan_cevre(int sayi1, int sayi2) {
    /* int alan=sayi1*sayi2;
        int cevre=2*(sayi1+sayi2);
        return alan; ------------------>alan ve çevreyi ikisinide returna atayamıyoruz o yüzden void kullanacağız
     */
    static void alan_cevre(int sayi1, int sayi2) {
        int alan = sayi1 * sayi2;
        int cevre = 2 * (sayi1 + sayi2);
        System.out.println("alan:" + alan);
        System.out.println("çevre:" + cevre);
    }

}
