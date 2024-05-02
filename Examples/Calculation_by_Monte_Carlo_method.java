package Examples;

import java.util.Scanner;

public class Calculation_by_Monte_Carlo_method {

    public static void main(String[] args) {
        //Klavyeden girilen pozitif tamsayıya göre π(pi)sayısını "Monte Carlo yöntemi"yle hesaplayan program
        Scanner scan = new Scanner(System.in);
        System.out.println("N sayısı girin");
        int n = scan.nextInt();
        int m = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random() * 2 - 1; 
            double y = Math.random() * 2 - 1; 

            if (x * x + y * y < 1) { 
                m++;
            }
        }

        double pi = 4.0 * m / n; 

        System.out.println("Sonuç: " + pi);
    }

}
