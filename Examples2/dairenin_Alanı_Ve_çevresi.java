package Examples2;

import java.util.Scanner;

public class dairenin_Alanı_Ve_çevresi {

    public static void main(String[] args) {
        // alan=pi*r*r
        //cevre=2*pi*r
        //pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("yarıçapı :");
        double r = sc.nextInt();
        double pi=3.14;
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("alan:"+alan);
        System.out.println("cevre:"+cevre);
        
    }

}
