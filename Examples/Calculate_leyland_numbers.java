package Examples;

import java.util.Scanner;

public class Calculate_leyland_numbers {

    public static void main(String[] args) {
        //klavyeden girilen x ve y değerleri için mümkün olan tüm leyland sayılarını hesaplayıp ekrana yazdıran program
        Scanner scanner = new Scanner(System.in);
        System.out.print("x değerini gir: ");
        int x = scanner.nextInt();
        System.out.print("y değerini girin: ");
        int y = scanner.nextInt();

        System.out.println("Leyland sayıları:");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                long leylandNumber = (long) (Math.pow(i, j) + Math.pow(j, i));
                System.out.println(leylandNumber);
            }
        }

    }
}
