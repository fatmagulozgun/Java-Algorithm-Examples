package Examples2;

import java.util.Scanner;

public class artık_yıl_bulma {

    public static void main(String[] args) {
        //Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır.100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır
        //Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin

        Scanner scan = new Scanner(System.in);
        System.out.println("yıl gir ");
        int year = scan.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
            System.out.println(year + " artık yıldır.");
        } else {
            System.out.println(year + " artık yıl değil.");
        }
       
    }

    
}
