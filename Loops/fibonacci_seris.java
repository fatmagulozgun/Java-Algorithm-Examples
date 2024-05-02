package Loops;

import java.util.Scanner;

public class fibonacci_seris {

    public static void main(String[] args) {
        //0112358...
        int ilksayi = 0;
        int ikincisayi = 1;
        int top = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("sayi gir");
        int sayi = sc.nextInt();
        System.out.print(ilksayi + " " + ikincisayi);

        for (int i = 2; i < sayi; i++) {

            top = ikincisayi + ilksayi;
            System.out.print(" " + top);
            ilksayi = ikincisayi;
            ikincisayi = top;
        }
    }

}
