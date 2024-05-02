package Examples2;

import java.util.Scanner;

public class girilen_sayı_asal_mı_değil_mi_bulma {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("kontrol edilecek sayıyı giriniz: ");
        int sayi = k.nextInt();
        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }

        if (sayac == 2) {
            System.out.println("asaldır");
        } else if (sayac != 2) {
            System.out.println("asal değildir");
        }
    }

}

