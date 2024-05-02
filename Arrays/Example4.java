package Arrays;
import java.util.Scanner;

public class Example4 {
//diziye dışardan değer atama ve diziyi toplama
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n giriniz");
        int n = scan.nextInt();
        int[] sayi = new int[n];
        
        System.out.println(sayi[sayi.length - 1]);
        System.out.println("dizinin uzunluğu:" + sayi.length);        
        

        //sayi dizisine dışardan tam sayı değer atama
        for (int i = 0; i <= sayi.length - 1; i++) {
            System.out.print((i + 1) + "inci sayı:");
            sayi[i] = scan.nextInt();        
        }
       //sayi dizisini yazdırma
        for (int i = 0; i <=sayi.length-1; i++) {
            System.out.println(i+"indis:"+sayi[i]);
        }
        //sayı dizisindeki elemanların toplamı
        int toplam=0;
        for (int i = 0; i <=sayi.length-1; i++) {
            toplam+=sayi[i];           
        }
        System.out.println("toplam:"+toplam);
    }

}

