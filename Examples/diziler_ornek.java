package Examples;

import java.util.Random;
import java.util.Scanner;

public class diziler_ornek {

    public static void main(String[] args) {
        //Bir dizi oluşturun ve içine 1 ile 100 arasında rastgele 20 sayı atanmasını sağlayın. 
        //Ekrana dizinin elemanlarını yazdırın. 
        //Program çalıştığında kullanıcıdan bir aranacak sayı isteyin ve dizi içerisinde 
        //doğrusal arama ile aranan sayıyı bulmaya çalışın.
        
        int[] dizim = new int[20];
        Scanner sc = new Scanner(System.in);
        Random randomum = new Random();
        for (int i = 0; i < dizim.length; i++) {
            //dizim[i]=randomum.nextInt(101);---->0 ile 100 arasında sayı üretir
            
            dizim[i] = randomum.nextInt(100) + 1; //1 ile 100 arasında sayı üretir
            System.out.print(dizim[i] + ",");
            

        }
        boolean bulundu =false;
        int index=-1;
        System.out.println();
        System.out.print("aranacak sayı girin:");
        int arama = sc.nextInt();
        for (int i = 0; i < dizim.length; i++) {
            if (arama == dizim[i]) {
                bulundu=true;
                index = i;
                break;
            }
        }

        // Sonucu ekrana yazdırma
        if (bulundu) {
            System.out.println("Aranan sayı dizide bulundu. Index: " + index);
        } else {
            System.out.println("Üzgünüm, aranan sayı dizide bulunamadı.");
        }
    }
}
