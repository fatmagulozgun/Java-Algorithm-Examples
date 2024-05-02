package Examples2;

import java.util.Scanner;

public class fahrenayt_hesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen fahrenheit değer giriniz");
        double fahr = input.nextDouble();
        double celcius = (fahr - 32) / 1.8;
        System.out.println(" değer:" + celcius);
    }

}
