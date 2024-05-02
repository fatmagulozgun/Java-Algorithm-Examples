package Examples2;

import java.util.Scanner;

public class sayıları_sıralama {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayi");
        a = sc.nextInt();
        System.out.println("2.sayı");
        b = sc.nextInt();
        System.out.println("3.sayi");
        c = sc.nextInt();
        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(a+">"+b+">"+c);
            } else {
                System.out.println(a+">"+c+">"+b);
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(b+">"+a+">"+c);
            } else {
                System.out.println(b+">"+c+">"+a);
            }
        }

    }

}
