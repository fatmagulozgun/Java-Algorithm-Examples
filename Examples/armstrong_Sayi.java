package Examples;

import java.util.Scanner;

public class armstrong_Sayi {

    public static void main(String[] args) {
        // 1-basamak sayısı bulunur /=10
        // 2-rakam bulunur %10.üslü toplanılır./10  

        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = sc.nextInt();
        int basamakSayisi = 0, gecici = sayi, gecici2 = sayi, rakam, top=1;
        while (sayi > 0) {
            gecici /= 10;
            basamakSayisi++;     
        }
        while (sayi > 0) {
            rakam=sayi%10;
            top+=Math.pow(rakam,basamakSayisi);
            sayi/=10;
        }
        if(top==gecici2){
            System.out.println(gecici2+"armstrongtur");
        }else{
            System.out.println(gecici2+"değildir");
        }
        
    }

}
