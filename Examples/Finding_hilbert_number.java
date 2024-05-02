package Examples;

import java.util.Scanner;

public class Finding_hilbert_number {

    public static void main(String[] args) {
        //klavyeden girilen pozitif tam sayının hilbert sayısı olup olmadığını test eden program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int number = scanner.nextInt();

        if (isHilbertNumber(number)) {
            System.out.println(number + " bir Hilbert sayısıdır.");
        } else {
            System.out.println(number + " bir Hilbert sayısı değildir.");
        }
    }

    // Bir sayının Hilbert sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isHilbertNumber(int number) {
        if (number <= 0) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        return squareRoot * squareRoot == number;
    }

}
