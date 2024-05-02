package Examples;

import java.util.Scanner;

public class Floyd_triangle {

    public static void main(String[] args) {
        // Klavyeden girilen sayısı için floyd üçgenini ekrana yazdıran program
        Scanner scanner = new Scanner(System.in);
        System.out.print("Floyd üçgeni için bir sayı girin: ");
        int number = scanner.nextInt();

        System.out.println("Floyd üçgeni:");
        printFloydTriangle(number);
    }

    // Floyd üçgenini oluşturan fonksiyon
    public static void printFloydTriangle(int number) {
        int currentNumber = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
    
}
