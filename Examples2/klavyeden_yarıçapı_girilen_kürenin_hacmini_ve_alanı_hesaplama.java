package Examples2;

import java.util.Scanner;

public class klavyeden_yarıçapı_girilen_kürenin_hacmini_ve_alanı_hesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3;

        System.out.println("Lütfen kürenin yarıçapını giriniz:");
        double yarıc = input.nextDouble();
        double hacim = (4 / 3) * pi * yarıc * yarıc * yarıc;
        double alan = 4 * pi * yarıc * yarıc;
        System.out.println("Hacim=" + hacim + "Alan=" + alan);
    }

}
