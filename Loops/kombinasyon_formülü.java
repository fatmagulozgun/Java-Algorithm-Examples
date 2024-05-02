
package Loops;

import java.util.Scanner;

public class kombinasyon_formülü {

    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        int n, r;
        int nF = 1;
        int rF = 1;
        int nrF = 1;
        int sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı (n): ");
        n = input.nextInt();
        System.out.print("Seçim Sayısı (r): ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            nF*=i;
        }
        for (int j = 1; j <=r; j++) {
            rF*=j;
        }
        for (int k = 1; k <=n-r; k++) {
            nrF*=k;
        }
        sonuc=nF/(rF*(nrF));
        System.out.println("sonuç"+sonuc);
    }

}
