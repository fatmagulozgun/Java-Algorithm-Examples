package Examples2;

import java.util.Scanner;

public class vücut_kitle_endeksi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("boy gir:");
        double boy = sc.nextDouble();
        
        System.out.println("kilo gir:");
        double kilo = sc.nextDouble();
        
        double index=(kilo/(boy*boy));
        System.out.println("indeksiniz"+index);
    }

}
