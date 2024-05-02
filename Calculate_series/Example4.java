package Calculate_series;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        System.out.println("x sayısı gir");
        int x = scan.nextInt();
        double toplam = 1.0; 
        double fakt = 1.0; 

        for (int i = 1; i < n; i++) {
            fakt *= i;
            toplam += Math.pow(x, i) / fakt;
        }

        System.out.println("Toplam: " + toplam);
    }

}
