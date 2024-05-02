package Examples;

import java.util.Scanner;

public class for_ile_sayi_ortalamasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kaç adet sayının ortalaması alınacak:");
        int adet = sc.nextInt();
        int ort=0;
        int toplam=0;
        for (int i = 0; i < adet; i++) {
            System.out.println((i+1)+"nci sayıyı gir:");
            int sayilar=sc.nextInt(); 
            toplam=toplam+sayilar;
        }
       
        ort=toplam/adet;
        System.out.println("ort:"+ort);
    }
    
}
