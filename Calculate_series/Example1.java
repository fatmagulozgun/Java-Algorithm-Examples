package Calculate_series;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int sayi = scan.nextInt();
        double toplam = 0;

        for (int i = 0; i < sayi; i++) {
            double fakt = 1;
            for (int j = 1; j <= 2 * i; j++) {
                fakt *= j;
            }
            toplam += Math.pow(-1, i) * Math.pow(sayi, 2 * i) / fakt;
        }
        System.out.print(toplam);
    }
}
