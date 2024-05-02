package Calculate_series;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        double t = 2.0; // double olarak tanımlanmalı
        double fakt = 1.0; 

        for (int i = 1; i <= n; i++) { 
            fakt *= (2 * i + 1); 
            t += (2 * i + 2) / fakt; 
        }

        System.out.print("Sonuç: " + t);
    }

}
