package Calculate_series;
import java.util.Scanner;
public class Example3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        double toplam = 0.0; 

        for (int i = 0; i < n; i++) { 
            toplam += 1.0 / ((2 * i + 1) * (2 * i + 2));
        }
        System.out.println(toplam);
    }
}

    
