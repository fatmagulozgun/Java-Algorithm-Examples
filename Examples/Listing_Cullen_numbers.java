package Examples;

import java.util.Scanner;

public class Listing_Cullen_numbers {

    public static void main(String[] args) {
        // klavyeden girilen terim sayısı kadar cullen sayılarını listeleyen program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Terim sayısını girin: ");
        int termCount = scanner.nextInt();

        System.out.println("Cullen sayıları:");
        for (int i = 1; i <= termCount; i++) {
            int cullenNumber = i * ((int) Math.pow(2, i)) + 1;
            System.out.println(cullenNumber);
        }

    }
}
