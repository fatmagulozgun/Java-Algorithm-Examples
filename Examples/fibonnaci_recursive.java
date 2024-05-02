package Examples;

import java.util.Scanner;

public class fibonnaci_recursive {

    public static void main(String[] args) {
        int hesap=0;
        //112358... f(1)=1 ,f(2)=1 ,f(3)=2,f(4)=3,f(5)=5  f(n)=f(n-1)+f(n-2)
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = sc.nextInt();
        System.out.println(f(sayi));
    }
    public static int f(int x){
        if(x==1 || x==2){
        return 1;
        }        
        return f(x-1)+f(x-2);
    }

}
