package Examples;

import java.util.Scanner;

public class Finding_all_sides_of_golden_triangle {

    public static void main(String[] args) {
        //  kullanıcıdan alınan kısa kenar uzunluğuna göre altın üçgenin tüm kenarlarını hesaplama
        Scanner scan = new Scanner(System.in);
        System.out.println("Altın üçgenin kısa kenarını girin:");
        int a = scan.nextInt();

        double altinOran = (1 + Math.sqrt(5)) / 2; 

        double b = a * altinOran;

        System.out.println("Kısa kenar (a): " + a);
        System.out.println("Uzun kenar (b): " + b);
    }

}
