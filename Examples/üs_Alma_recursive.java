package Examples;

import java.util.Scanner;

public class üs_Alma_recursive {

    public static void main(String[] args) {
        //x=1 y =1 ise sonuç:1
        //x=1 y =0 ise sonuç:1
        //x*üs alma(x,y-1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println(üsAlma(sayi1, sayi2));
    }

    public static int üsAlma(int x, int y) {
        if((x==1 || y==1)&& (x==1)||(y==0)){
        return 1;
        }
        return x * üsAlma(x, y - 1);
    }

}
