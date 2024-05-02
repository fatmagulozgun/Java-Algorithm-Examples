package Examples;

import java.util.Scanner;

public class onsekizden_büyükse_giriş {

    public static void main(String[] args) {
        //Klavyeden girilen yaş bilgisi 18’den büyük ise girişi onaylayan 
        //değilse onaylamayan bir fonksiyon yazalım. 
        Scanner sc = new Scanner(System.in);
        System.out.println("yaş gir:");
        int yas = sc.nextInt();
        yasBüyükMü(yas);
    }
    public static int yasBüyükMü(int yas) {
        if (yas > 18) {
            System.out.println("giriş onaylandı");
        } else if (yas < 18) {
            System.out.println("yaşın küçük giriş onaylanmadı");
        }
        return yas;
    }
}
