package Examples2;

import java.util.Scanner;

public class KenaruzunşuğuVeYüksekliği {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgene ait kenar uzunluğunu ve yüksekliğini giriniz:");
        int a = input.nextInt();
        int b = input.nextInt();
        int alan = a * b / 2;
        System.out.println("Alan:" + alan);
    }

}
