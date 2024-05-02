package Examples;

import java.util.Scanner;

public class vize_final_harf_notu {
//5 farklı öğrenci için klavyeden vize ve final notlarını alarak dönem
//sonu notunu hesaplayıp harf notlarını ekrana yazdıran metodu oluşturalım.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 0, dönemnotu = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "nci öğrencinin vize notunu gir:");
            int vize = sc.nextInt();

            System.out.println((i + 1) + "nci öğrencinin final notunu gir:");
            int fnl = sc.nextInt();
            dönemnotu = ((vize)%40+ (fnl)%60)/2;
            System.out.println((i + 1) + "in dönem sonu notu" + dönemnotu);
            if (dönemnotu <= 50) {
                System.out.println("harfnotu CC");
            } else if (dönemnotu >= 50) {
                System.out.println("harfnotu AA");
            }
            
        }

    }

}
