package Examples;

import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_oyunu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        //rastagele sayi üsttik 0- 100 arasında
        int sayi = rd.nextInt(101);
        System.out.println("0-100 arasında sayi gir:");
        int tahmin = sc.nextInt();

        while (true) {
            if (tahmin < 0 && tahmin > 0) {
                System.out.println("0-100 arasında sayi gir:");
                tahmin = sc.nextInt();
            } else if (tahmin > sayi) {
                System.out.println("tahmininiz büyüktür");
                tahmin = sc.nextInt();
            } else if (tahmin < sayi) {
                System.out.println("tahmininiz küçüktür");
                tahmin = sc.nextInt();
            }else if(sayi==tahmin){
                System.out.println("doğru tahmin sayımız:"+sayi);
                break;
            }
            

        }

    }

}
