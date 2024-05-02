package Examples;

import java.util.Scanner;

public class bir_Sayinin_bolenleri {

    public static void main(String[] args) { 
        //SORU:kullanıcıdan bir tam sayı (a) girmesini isteyen ve daha sonra bu sayının bölenlerini ekrana yazdırma
        //12=1,2,3,4,6,12
        Scanner sc = new Scanner(System.in);
        System.out.println("a gir:");
        int a = sc.nextInt();
        int adet=0;
        for (int i = 1; i <= a; i++) {
            if(a%i==0){
                System.out.print(+i+",");
                adet++;                          
            }
            
        }
        System.out.println();
        System.out.println(a+"sayısını bölen"+adet+"sayısı vardır.");
    }
    
}
