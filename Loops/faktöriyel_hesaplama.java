package Loops;

import java.util.Scanner;

public class faktöriyel_hesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi = sc.nextInt();
        int faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
        }
        System.out.println("sonuç"+faktoriyel);
    }

}
