package Examples;

import java.util.Scanner;

public class ekok_bulma {


    // İki sayının EBOB'unu hesaplayan metot
    static int ebobHesapla(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // İki sayının EKOK'unu hesaplayan metot
    static int ekokHesapla(int x, int y) {
        return (x * y) / ebobHesapla(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayıları alma
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        // EKOK'u hesapla
        int ekokSonucu = ekokHesapla(sayi1, sayi2);

        // Sonucu ekrana yazdırma
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u: " + ekokSonucu);
    }
}

    
    

