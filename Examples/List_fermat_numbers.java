package Examples;

import java.util.Scanner;

public class List_fermat_numbers {

    public static void main(String[] args) {
        // klavyeden alınan terim sayısı kadar Fermat sayısını hesapla.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Terim sayısını girin: ");
        int termCount = scanner.nextInt();

        System.out.println("Fermat sayıları:");
        for (int i = 0; i < termCount; i++) {
            long fermatNumber = (long) Math.pow(2, Math.pow(2, i)) + 1;
            System.out.println(fermatNumber);
        }
    }
}
