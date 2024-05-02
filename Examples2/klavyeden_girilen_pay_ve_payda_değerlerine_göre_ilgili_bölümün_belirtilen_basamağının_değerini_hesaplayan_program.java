package Examples2;

import java.util.Scanner;

public class klavyeden_girilen_pay_ve_payda_değerlerine_göre_ilgili_bölümün_belirtilen_basamağının_değerini_hesaplayan_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("payı girin:");
        int pay = input.nextInt();
        System.out.println("paydayı girin:");
        int payda = input.nextInt();
        System.out.println("Hangi basamak istediğinizi girini:");
        int bas = 0;
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            pay = payda * 10;
            bas = pay / payda;
            pay = pay % payda;
        }
        System.out.println("Basamak değeri" + bas);
    }
}
