package Examples;

import java.util.Scanner;

public class Arithmetic_number_calculation {

    public static void main(String[] args) {
        // klavyeden girilen pozitif tam sayının aritmetik sayı olup olmadığını test eden program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        if (AritmetikMi(sayi)) {
            System.out.println(sayi + " aritmetik sayıdır.");
        } else {
            System.out.println(sayi + " aritmetik değildir.");
        }
    }

    public static boolean AritmetikMi(int sayi) {
        if (sayi <= 0) {
            return false;
        }

        String numberString = String.valueOf(sayi);
        int difference = Character.getNumericValue(numberString.charAt(1)) - Character.getNumericValue(numberString.charAt(0));

        for (int i = 1; i < numberString.length() - 1; i++) {
            int currentDifference = Character.getNumericValue(numberString.charAt(i + 1)) - Character.getNumericValue(numberString.charAt(i));
            if (currentDifference != difference) {
                return false;
            }
        }

        return true;
    }

}
