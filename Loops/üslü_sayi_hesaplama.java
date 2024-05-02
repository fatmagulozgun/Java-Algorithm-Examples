package Loops;

import java.util.Scanner;

public class üslü_sayi_hesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("üst sayi girin");
        int üst = sc.nextInt();
        System.out.println("alt sayi girin");
        int alt = sc.nextInt();
        int sonuc=1;
        
        for (int i = 1; i <=  üst; i++) {
           sonuc*= alt;
        }
        System.out.println("sonuç:"+sonuc);
    }

}
