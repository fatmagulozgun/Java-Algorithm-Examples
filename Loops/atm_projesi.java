package Loops;

import java.util.Scanner;

public class atm_projesi {

    public static void main(String[] args) {
        String usarname, password;
        Scanner sc = new Scanner(System.in);
        int hak = 3;
        int secim;
        int bakiye = 1500;
        while (hak > 0) {
            System.out.println("kullanıcı adınız:");
            usarname = sc.nextLine();
            System.out.println("şifre:");
            password = sc.nextLine();
            if (usarname.equals("patika") && password.equals("dev123")) {
                System.out.println("sisteme giriş yaptınız");

                do {
                    System.out.println("1-para yatırma\n"
                            + "2-para çekme\n"
                            + "3-bakiye sorgula\n"
                            + "4-çıkış yap");
                    System.out.println("yapmak istediğiniz işlemi seçin");
                    secim = sc.nextInt();
                    if (secim == 1) {
                        System.out.println("yatıracağın para miktari");
                        int yatirilan = sc.nextInt();
                        bakiye += yatirilan;
                    } else if (secim == 2) {
                        System.out.println("çekilecek para miktari");
                        int cekilen = sc.nextInt();
                        if (cekilen > bakiye) {
                            System.out.println("bakiye yetersiz");
                        } else {
                            bakiye -= cekilen;
                        }

                    } else if (secim == 3) {
                        System.out.println("bakiyeniz:" + bakiye);
                    }

                } while (secim != 4);

                break;
            } else {
                hak--;
                System.out.println("hatalı giriş yaptınız");
                System.out.println("kalan hakkınız:" + hak);
            }
        }

    }

}
