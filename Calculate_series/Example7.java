package Calculate_series;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        double t = 0.0; 

        for (int i = 0; i < n; i++) {
            t += Math.pow(-1, i) / ((2 * i + 1) * Math.pow(3, i)); 
        }

        double sonuc = Math.sqrt(12) * t; 

        System.out.print("Sonuç: " + sonuc);
    }

}
