package Examples;

import java.util.Scanner;

public class iki_sayinin_ebobu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println(ebob(sayi1,sayi2));
    }
    public static int ebob(int x,int y){
    while(y!=0){
    int temp=y;
    y=x%y;
    x=temp;
    }
    return x;
    }
    
}
