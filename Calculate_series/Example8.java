package Calculate_series;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        double sonuc = 1.0; 

        for (int i = 1; i <= n; i++) {
            int c1 = 4 * i * i;
            int c2 = (c1 - 1);
            sonuc *= (double) c1 / c2; 
        }

        sonuc *= 2; 

        System.out.print("Sonuç: " + sonuc);
    }

}
