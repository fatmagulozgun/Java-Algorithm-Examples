package Examples2;

import java.util.Scanner;

public class KlavyedenBirİletininDirenciİleAkımıHesaplama {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iletkenin direncini ve akımını giriniz:");
        double d = input.nextDouble();
        double akım = input.nextDouble();
        double gerilim = d*akım;
        System.out.println("Gerilim=" +gerilim);
    }

}
