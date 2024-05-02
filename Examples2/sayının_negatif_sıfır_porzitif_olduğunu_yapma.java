package Examples2;

import java.util.Scanner;

public class sayının_negatif_sıfır_porzitif_olduğunu_yapma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("lütfen sayı giriniz");
            int sayi = scan.nextInt();
            if (sayi > 0) {
                System.out.println("sayınız pozitiftir");
            } else if (sayi < 0) {
                System.out.println("sayınız negatiftir");
            } else {
                System.out.println("sayınız sıfır");
            }
        }
    }
}
