package Calculate_series;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        System.out.println("x sayısı gir");
        int x = scan.nextInt();

        double sonuc = Math.pow(1 + (double)x / n, n);
        System.out.println("Sonuç: " + sonuc);
    }
    
}
