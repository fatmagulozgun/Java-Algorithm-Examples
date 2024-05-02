package Examples;

import java.util.Scanner;

public class uc_sayiyi_siralama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı gir");
        int sayi1 = sc.nextInt();

        System.out.println("2.sayıyı gir");
        int sayi2 = sc.nextInt();

        System.out.println("3.sayıyı gir");
        int sayi3 = sc.nextInt();

        if (sayi1 <= sayi2 && sayi2 <= sayi3 && sayi1 < sayi3) {
            System.out.println("sıralama:" + sayi1 + "<" + sayi2 + "<" + sayi3);
        } else if (sayi1 <= sayi3 && sayi1 <= sayi2 && sayi3 < sayi2) {
            System.out.println("sıralama:" + sayi1 + "<" + sayi3 + "<" + sayi2);
            
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3 && sayi1 < sayi3) {
            System.out.println("sıralama:" + sayi2 + "<" + sayi1 + "<" + sayi3);
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3 && sayi3 < sayi1) {
            System.out.println("sıralama:" + sayi2 + "<" + sayi3 + "<" + sayi1);
            
        } else if (sayi3 <= sayi1 && sayi3 <= sayi1 && sayi1 < sayi2) {
            System.out.println("sıralama:" + sayi3 + "<" + sayi1 + "<" + sayi2);
        } else if (sayi3 <= sayi1 && sayi3 <= sayi2 && sayi2 < sayi1) {
            System.out.println("sıralama:" + sayi3 + "<" + sayi2 + "<" + sayi1);
        }
    }

}
