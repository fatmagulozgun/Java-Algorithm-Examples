package Examples;

import java.util.Scanner;

public class metotla_asal {
//Asal=2,3,5,7,11,13,17  kendisinden ve 1'den başka böleni olmayan

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = sc.nextInt();
        AsalMı(sayi);

    }

    public static void AsalMı(int x) {
        for (int i = 2; i < x; i++) {
            if(x%i==0){
                System.out.println("asal değil");
            }else{
                System.out.println("asal");
            }
        }
    }

}
