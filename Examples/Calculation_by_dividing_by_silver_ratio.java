package Examples;

import java.util.Scanner;

public class Calculation_by_dividing_by_silver_ratio {

    public static void main(String[] args) {
        //kullanıcıdan alınan doğru parçasını gümüş orana uygun olarak bölerek hesaplama
        Scanner scan = new Scanner(System.in);
        System.out.println("U sayısı girin:");
        int u = scan.nextInt();

        double gumusOran = (1 + Math.sqrt(2)) / 2; 

        int b = (int)(u / (2 + Math.pow(2, 0.5)));
        int a = u - b; 

        System.out.println("Doğru parçası (a): " + a);
        System.out.println("Doğru parçası (b): " + b);
    }
    
}
