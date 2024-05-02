package Examples;

import java.util.Scanner;

public class dort_islem_metodlarla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hangi işlemi yaptıracaksın"
                + "1-toplama"
                + "2-çıkarma");
        int islem = sc.nextInt();
        System.out.println("işlem yapmak istediğin sayıları gir:");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();

        switch (islem) {
            case 1:
                toplama(sayi1, sayi2);
                break;
            case 2:
                çıkarma(sayi1, sayi2);
                break;
        }
    }

    static void toplama(int sayi1, int sayi2) {
        int top = sayi1 + sayi2;
        System.out.println(top);
    }

    static void çıkarma(int sayi1, int sayi2) {
        int çıkarma=sayi2-sayi1;        
        System.out.println(çıkarma);
}

}
