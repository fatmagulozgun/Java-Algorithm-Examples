package Examples;

import java.util.Scanner;

public class on_tabanı_2_cevirme {
    
    static String tabanDonusum(int sayi) {
        // Temel durum: sayi sıfırsa, 2 tabanındaki karşılığı "0" dır.
        if (sayi == 0) {
            return "0";
        }

        // Recursive durum: sayıyı 2'ye böl, kalanı al, ve geriye kalan kısmın 2 tabanındaki karşılığı ile birleştir.
        return tabanDonusum(sayi / 2) + (sayi % 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 10 tabanındaki sayıyı alma
        System.out.print("10 tabanındaki bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // 2 tabanındaki karşılığı hesapla
        String binaryKarşılık = tabanDonusum(sayi);

        // Sonucu ekrana yazdırma
        System.out.println(sayi + " sayısının 2 tabanındaki karşılığı: " + binaryKarşılık);
    }
}



