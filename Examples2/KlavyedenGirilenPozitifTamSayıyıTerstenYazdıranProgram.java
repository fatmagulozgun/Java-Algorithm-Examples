package Examples2;

import java.util.Scanner;

public class KlavyedenGirilenPozitifTamSayıyıTerstenYazdıranProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int a = input.nextInt();
        System.out.print("Girilen sayının tersten yazılışı:");
        while (a > 0) {
            System.out.print(a % 10);
            a /= 10;
        }

    }
}
