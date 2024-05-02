package Examples2;

import java.util.Scanner;

public class hava_sıcaklığına_göre_etkinlik_önerme {

    public static void main(String[] args) {
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öneriyor.
        // Sıcaklık 5 ve 15 arasında ise "Sinema" incelemesi öneriliyor.
        // Sıcaklık 15 ve 25 arasında ise "Piknik" görüşmesini öneriyor.
        // Sıcaklık 25 'ten büyük ise "Yüzme" görüşü öneriyor.
        Scanner sc = new Scanner(System.in);
        System.out.println("sıcaklığı gir:");
        int sıc = sc.nextInt();
        if (sıc < 5) {
            System.out.println("kayak yapılabilir");
        } else if (sıc < 5 && sıc > 15) {
            System.out.println("sinemaya gidilebilir");
        } else if (sıc < 15 && sıc > 25) {
            System.out.println("piknik yapabilirsin");
        } else if (sıc > 25) {
            System.out.println("yüzme yapabilirsin");
        }

    }

}
