package Examples2;

import java.util.Scanner;

public class stringSorusu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz:");
        String txt = input.nextLine();
        char[] is = {' ', ',', ';', ':', '-', '?', '!'};
        int sayac = 0;
        for (int i = 0; i <= txt.length(); i++) {
            char h = txt.charAt(i);
            for (int j = 0; j <= is.length; j++) {
                if (h == is[j]) {
                    sayac++;
                    break;
                }
            }

        }
        System.out.println("Cümlede" + (sayac + 1) + "tane kelime vardır.");

    }

}
