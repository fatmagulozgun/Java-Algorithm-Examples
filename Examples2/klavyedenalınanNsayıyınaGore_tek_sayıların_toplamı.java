package Examples2;

import java.util.Scanner;

public class klavyedenalınanNsayıyınaGore_tek_sayıların_toplamı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int say = scan.nextInt();
        int i = 1;
        int toplam = 0;
        while (i <= say) {
            if (i % 2 == 0) {
                toplam = toplam + i;
            }
            i++;
        }
        System.out.println(toplam);

    }

}
