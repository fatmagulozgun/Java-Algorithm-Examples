
package Examples2;

import java.util.Scanner;

public class büyük_olan_sayıyı_yazdırma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı girin");
        int say1 = input.nextInt();
        System.out.println("2.sayıyı girin");
        int say2 = input.nextInt();
        System.out.println("3.sayıyı girin");
        int say3 = input.nextInt();
        if (say1 > say2 && say1 > say3) {
            System.out.println("büyük sayı :" + say1);
        } else if (say2 > say1 && say2 > say3) {
            System.out.println("büyük sayı :" + say2);
        } else if (say3 > say1 && say3 > say2) {
            System.out.println("büyük sayı :" + say3);
        } else {
            System.out.println("büyüklük yok");
        }
    }

}
