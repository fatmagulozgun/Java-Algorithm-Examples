package Examples;

import java.util.Scanner;

public class Calculation3 {

    public static void main(String[] args) {
        // kullanıcıdan alınan N sayısına göre 5^1/2 değerini hesapla
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double t = 1.0; 

        for (int i = 1; i <= n; i++) { 
            t = 4 + 1 / t; 
        }

        double sonuc = 2 + 1 / t; 

        System.out.println("Sonuç: " + sonuc);
    }

}
