package Loops;

import java.util.Scanner;

public class girilen_sayıya_kadar_olan_çift_sayılar {

    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi girin");
        k=sc.nextInt();
        
        for (int i = 1; i <= k; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
