package Examples2;

import java.util.Scanner;

public class kullanıcı_girisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kullanıcı adınız:");
        String usarname = sc.nextLine();
        System.out.println("şifreniz:");
        String password = sc.nextLine();
        if (usarname.equals("patika") && password.equals("java123")) {
            System.out.println("giriş yaptınız");
        } else {
            System.out.println("bilgileriniz yanlış ");
        }

    }

}
