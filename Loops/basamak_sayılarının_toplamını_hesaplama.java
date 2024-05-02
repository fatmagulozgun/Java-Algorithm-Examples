package Loops;

import java.util.Scanner;

public class basamak_sayılarının_toplamını_hesaplama {

    public static void main(String[] args) {
        // 1643 = 1 + 6 + 4 + 3 = 14
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir:");
        int rakam;
        int top=0;
        int sayi = sc.nextInt();
        while(sayi>0){
        rakam=sayi%10;
        top+=rakam;
        sayi/=10;                     
        }
        System.out.println("top:"+top);
    }
    
}
