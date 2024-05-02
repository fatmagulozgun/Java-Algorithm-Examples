package Examples2;

import java.util.Scanner;

public class Klavyeden_girilen_b_tamsayısına_göre_sayısını_bulma {

    public static void main(String[] args) {
        // a^3-a^2=b şartını_sağlayan 0-100 arasında
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen b sayısını giriniz:");
        int b = input.nextInt();

        for (int a = 1; a <= 99; a++) {
            if (a * a * a - a * a == b) {
                System.out.println("a:" + a);
            }
        }

    }

}

    

