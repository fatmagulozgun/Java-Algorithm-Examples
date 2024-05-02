package Examples;

import java.util.Scanner;

public class Golden_ratio_length_calculation {

    public static void main(String[] args) {
        // kullanıcıdan alınan AB doğru parçasının uzunluğunu alıp altın orana uygun şekilde bölerek AC ve CB uzunluklarını hesaplama.
        Scanner scan = new Scanner(System.in);
        System.out.println("AB doğru parçasının uzunluğunu girin:");
        double ab = scan.nextDouble();

        double altinOran = (1 + Math.sqrt(5)) / 2; 

        double cb = ab / altinOran; 
        double ac = ab - cb; 

        System.out.println("AC uzunluğu: " + ac);
        System.out.println("CB uzunluğu: " + cb);
    }

}
