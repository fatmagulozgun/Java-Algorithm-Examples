package Examples2;

import java.util.Scanner;

public class klavyedenDereceCinsindenGirilenAçıyıRadyanVeGradyanCinsinÇevirenProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LÜtfen derece cinsinden açıyı giriniz:");
        double a = input.nextDouble();
        double rad = a * Math.PI / 180;
        double grad = a * Math.PI / 200;
        System.out.println("Radyan=" + rad + "Gradyan=" + grad);
    }

}
