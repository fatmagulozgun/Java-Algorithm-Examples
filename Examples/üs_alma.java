package Examples;

import java.util.Scanner;

public class üs_alma {

    public static void main(String[] args) {
        //2^4=2*2*2*2
        Scanner sc = new Scanner(System.in);
        System.out.println("tabanı gir:");
        int alt = sc.nextInt();
        System.out.println("üssü gir:");
        int üst = sc.nextInt();
        int top=1;
        for (int i = 1; i <= üst; i++) {
            top=top*alt;
        }
        System.out.println("toplam:"+top);
    }
    
}
