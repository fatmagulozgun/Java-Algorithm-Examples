package Examples2;

import java.util.Scanner;

public class metreyi_kilometreye_santimetreye_dönüştürme {

    public static void main(String[] args) {
        int kmcevir, cmcevirme;
        Scanner scan = new Scanner(System.in);
        System.out.println("çevirmek istediğiniz uzunluğu m cinsinden yazınız");
        int m = scan.nextInt();

        kmcevir = m / 1000;
        cmcevirme = m * 1000;

        System.out.println("km cinsinden:" + "" + kmcevir);
        System.out.println("cm cinsinden:" + "" + cmcevirme);

    }

}
