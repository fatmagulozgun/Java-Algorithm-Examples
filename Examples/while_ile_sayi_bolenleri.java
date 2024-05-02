package Examples;

import java.util.Scanner;

public class while_ile_sayi_bolenleri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a gir:");
        int a = sc.nextInt();
        int adet = 0;
        int i = 1;
        while (i <= a) {
            if (a % i == 0) {
                adet++;
                
                System.out.println("sayılar:"+i);
            }
            i++;
            
        }
        System.out.println("sayı adedi:"+adet);
    }

}
