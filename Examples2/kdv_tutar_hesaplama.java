package Examples2;

import java.util.Scanner;

public class kdv_tutar_hesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kdv = 0.0;
        double kdvtutar = 0.0;
        double kdvlifiyat = 0;
        System.out.println("tutar giriniz:");
        int tutar = sc.nextInt();

        if (tutar > 0 && tutar < 1000) {
            kdv = 0.18;
        kdvtutar = tutar * kdv;
            kdvlifiyat = kdvtutar + tutar;
            System.out.println("fiyat:" + kdvlifiyat);
        } else if (tutar > 1000) {
            kdv = 0.08;
        kdvtutar = tutar * kdv;
            kdvlifiyat = kdvtutar + tutar;
            System.out.println("fiyat 1000 den büyükse fiyat:" + kdvlifiyat);
        }

    }

}
