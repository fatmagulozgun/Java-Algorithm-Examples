package Examples2;

import java.util.Scanner;

public class klavyedenKütlesiHızıVeYerdenyüksekliği_girilen_maddenin_potandiyel_ve_kinetik_enerjisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen maddenin kütlesini, hızını ve yerden yüksekliğini giriniz:");
        double kütle = input.nextDouble();
        double hız = input.nextDouble();
        double h = input.nextDouble();
        System.out.println("Lütfen maddenin yerçekimi ivmesini giriniz:");
        double g = input.nextDouble();
        double potansiyel_enerji = kütle * g * h;
        double kinetik_enerji = 1 / 2 * kütle * hız * hız;
        System.out.println("Kinetik Enerji=" + kinetik_enerji + "Potansiyel Enerji=" + potansiyel_enerji);
    }

}
