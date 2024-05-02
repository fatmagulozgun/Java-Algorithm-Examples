package Examples;

import java.util.Scanner;

public class Calculation2 {

    public static void main(String[] args) {
        //kullanıcıdan alınan N sayısına göre 3^1/2 değerini hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı gir");
        int n = scan.nextInt();
        double t = 1.0; 

        for (int i = 1; i <= n; i++) { 
            t = 1 + 1 / (2 + 1 / t); 
        }

        double sonuc = t; 

        System.out.println("Sonuç: " + sonuc);
    }

}
