package Arrays;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        // fibonnaci : 1 1 2 3 5 ...
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n = sc.nextInt();
        
        int dizi []=new int [n];
        dizi[0]=1;
        dizi[1]=1;
        for (int i = 2; i < n; i++) {
            dizi[i]=dizi[i-1]+dizi[i-2];
        }
        
        System.out.println("sayıya kadar fib serisi : ");
        for (int i = 0; i < n; i++) {
            System.out.print(dizi[i]+"  ");
           
        }
        
        

    }

}
