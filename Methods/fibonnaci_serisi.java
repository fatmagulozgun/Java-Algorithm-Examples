package Methods;

import java.util.Scanner;

public class fibonnaci_serisi {

    public static void main(String[] args) {
        // 112358...
        //f(3)=f(2)+f(1)----------->f(n)=f(n-1)+f(n-2)
        //ÖZYİNELİ metod olur her zaman return kullanılır

        /*DÖNGÜLER İLE KULLANILDIĞINDA;
        int ilksayi = 0;
        int ikincisayi = 1;
        int top = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("sayi gir");
        int sayi = sc.nextInt();
        System.out.print(ilksayi + " " + ikincisayi);

        for (int i = 2; i < sayi; i++) {

            top = ikincisayi + ilksayi;
            System.out.print(" " + top);
            ilksayi = ikincisayi;
            ikincisayi = top;
         */
        
        System.out.println(fibo(7));//--------->7.eleman?
    }

    static int fibo(int n) {
        if (n == 1 || n == 2) {//--------->1.veya 2. eleman ise hemen 1 i yapıştır VEYA KULLAN!!!
            return 1;
        }else{
        return fibo(n - 1) + fibo(n - 2);
    }
}

}
