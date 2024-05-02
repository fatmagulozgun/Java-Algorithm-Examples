package Examples2;

import java.util.Scanner;

public class hesap_makinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.println("ilk sayıyı gir:");
        sayi1 = sc.nextInt();
        System.out.println("ikinci sayıyı gir:");
        sayi2 = sc.nextInt();
        System.out.println("yapmak istediğin işlemi seçin");
        System.out.println("1-toplama \n 2-çıkarma \n 3-çarpma \n 4-bölme");
        System.out.println("seçiminiz:");
        secim = sc.nextInt();

        if (secim == 1) {
            System.out.println("toplama:" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("çıkarma:" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("çarpma:" + (sayi1 * sayi2));
        } else if (secim == 4) {
            if (sayi2 == 0) {
                System.out.println("ikinci sayi 0 a esşittir ve sonuc belirsizdir");
            } else {
                System.out.println("bölme:" + (sayi1 / sayi2));
            }
        } else {
            System.out.println("geçersiz bir işlem girdiniz");
        }
    }

}
