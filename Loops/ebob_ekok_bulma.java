package Loops;

import java.util.Scanner;

public class ebob_ekok_bulma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayi girin");
        int sayi1 = sc.nextInt();
        System.out.println("2. sayi girin");
        int sayi2 = sc.nextInt();
        int ebob=1;
        int ekok;
        int min;
        if (sayi1 > sayi2) {
            min = sayi2;
        } else {
            min = sayi1;
        }
        for(int i=min;i>0;i--){
            if((sayi1%i==0)&&(sayi2%i==0)){
            ebob=i;
            break;
            }
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("ekok:"+ekok);
        System.out.println("ebob:"+ebob);
    }
}
