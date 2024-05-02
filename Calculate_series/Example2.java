package Calculate_series;
import java.util.Scanner;
public class Example2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        System.out.println("x sayısı girin");
        int x = scan.nextInt();
        double toplam = 0;

        for (int i = 1; i < n; i++) {
            double fakt = i; // Faktöriyel hesabına gerek yok, direkt i kullan
            toplam += Math.pow(-1, i-1) * Math.pow(x, 2*i-1) / fakt; 
        }
        System.out.println(toplam);
    }
}
