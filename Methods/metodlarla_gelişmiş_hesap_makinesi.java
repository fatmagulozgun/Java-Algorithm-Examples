package Methods;

import java.util.Scanner;

public class metodlarla_gelişmiş_hesap_makinesi {

    static void topla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sayıyı gir:");
        int sayi1 = sc.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println("sonuç:" + (sayi1 + sayi2));
    }

    static void cıkar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sayıyı gir:");
        int sayi1 = sc.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println("sonuç:" + (sayi1 - sayi2));
    }

    static void carp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sayıyı gir:");
        int sayi1 = sc.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println("sonuç:" + (sayi1 * sayi2));
    }

    static void bol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sayıyı gir:");
        int sayi1 = sc.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println("sonuç:" + (sayi1 / sayi2));
    }

    static void üsAl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("alt Sayıyı gir:");
        int sayi1 = sc.nextInt();
        System.out.print("üst Sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayi2; i++) {
            sonuc *= sayi1;
        }
        System.out.println("sonuç:" + sonuc);
    }

    static void faktoriyel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı gir:");
        int sayi = sc.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("sonuç:" + sonuc);
    }

    static void mod() {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        int mod = input.nextInt();
        System.out.println("SONUÇ: " + (sayi % mod));
    }

    static void alanVeCevre() {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        int sayi2 = input.nextInt();

        int alan = sayi1 * sayi2;
        int cevre = 2 * (sayi1 + sayi2);
        System.out.println("ALAN: " + alan);
        System.out.println("CEVRE: " + cevre);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int islem;
        while (true) {
            System.out.println(""
                    + "0-programı sonlandır\n"
                    + "1-toplama işlemi\n"
                    + "2-çıkarma işlemi\n"
                    + "3-çarpma işlemi\n"
                    + "4-Bölme işlemi\n"
                    + "5-üslü sayi işlemi\n"
                    + "6-faktoriyel işlemi\n"
                    + "7-mod işlemi\n"
                    + "8-dikdörtgen alan ve cevre işlemi\n");
            System.out.println("lütfen bir işlem seçiniz");
            islem = sc.nextByte();

            if (islem == 0) {
                break;
            }
            switch (islem) {
                case 1:
                    topla();
                    break;

                case 2:
                    cıkar();
                    break;

                case 3:
                    carp();
                    break;

                case 4:
                    bol();
                    break;

                case 5:
                    üsAl();
                    break;

                case 6:
                    faktoriyel();
                    break;

                case 7:
                    mod();
                    break;

                case 8:
                    alanVeCevre();
                    break;
                    
                default:
                    System.out.println("Lütfen geçerli bir işlem numarası seçiniz!!!");
            }
        }
        System.out.println("Hesap makinesi kapanıyor !!!");
    }
}
