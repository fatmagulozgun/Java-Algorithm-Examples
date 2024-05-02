package Loops;

import java.util.Scanner;

public class Do_while_VizeVeFinalAlınacak0100Arasında {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vize, fnl;
        do {
            System.out.println("LÜtfen vize notu giriniz:");
            vize = input.nextInt();
            System.out.println("LÜtfen fnl notu giriniz:");
            fnl = input.nextInt();
        } while (vize < 0 || vize > 100 || fnl < 0 || fnl > 100);

        double ort = (double) vize * 0.4 + fnl * 0.6;

        if (ort >= 80 && ort <= 100) {
            System.out.println("Ortalamanız:" + ort + "ve harf notunuz:A");
        } else if (ort >= 60 && ort <= 59) {
            System.out.println("Ortalamanız:" + ort + "ve harf notunuz:B");
        } else if (ort >= 50 && ort <= 59) {
            System.out.println("Ortalamanız:" + ort + "ve harf notunuz:C");
        } else {
            System.out.println("Ortalamanız:" + ort + "ve harf notunuz:D");
        }
    }

}
