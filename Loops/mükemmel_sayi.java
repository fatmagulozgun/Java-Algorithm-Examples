package Loops;

import java.util.Scanner;
public class mükemmel_sayi {

    public static void main(String[] args) {
        //Bir sayının kendisi pozitif hariç tam sayı çarpanları (kalansız bölen yapılandırman) toplam ona eşit olan sayıya mükemmel sayı denir.
        //28=1+2+4+7+14=28
        Scanner sc=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=sc.nextInt();
        int top=0;
        for (int i = 1; i <  sayi; i++) {
            if(sayi%i==0){
            top+=i;
            }
        }
        if(top==sayi){
            System.out.println("mükemmel sayidir");
        }else{
            System.out.println("mükemmel değil");
        }
        
        
    }
    
}
