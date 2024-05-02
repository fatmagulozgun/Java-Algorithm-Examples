package Loops;

import java.util.Scanner;

public class asal_sayi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=sc.nextInt();
        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0){
                System.out.println("asal değildir");
            }else{
                System.out.println("asaldır");
            }
            break;
        }
    }
    
}
