package Examples2;

import java.util.Scanner;

public class km_hesaplama {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//consoldan değer almak için tanımladık
        System.out.println("Lütfen km cinsinden değer giriniz");
        int km = input.nextInt();
        int metre = km * 1000;
        System.out.println("hesaplanan metre: " + metre);

    }

}
