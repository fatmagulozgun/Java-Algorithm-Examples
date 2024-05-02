package Examples2;

import java.util.Scanner;

public class taksimetre_programı {

    public static void main(String[] args) {
        // km başına 2,20 tutmaktadır
        //min ödecek tutar 20 tl dir.20 tl altındaki ücretlerde yine 20 tl alınacaktır
        //taksimetre açılış ücreti 10 tl dir

        Scanner sc = new Scanner(System.in);
        System.out.println("kilometre gir:");
        double km = sc.nextInt();
        double hesap = (km * 2.20)+10;
        if (hesap <= 20) {
            System.out.println("ödenecek tutar 20 tldir");
        } else {
            System.out.println("tutar:" + hesap);
        }
    }

}
