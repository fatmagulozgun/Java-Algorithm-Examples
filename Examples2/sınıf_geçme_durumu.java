package Examples2;

import java.util.Scanner;

public class sınıf_geçme_durumu {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner sc = new Scanner(System.in);
        System.out.println("mat notunuz:");
        mat = sc.nextInt();

        System.out.println("mat notunuz:");
        fizik = sc.nextInt();

        System.out.println("fizik notunuz:");
        kimya = sc.nextInt();

        System.out.println("kimya notunuz:");
        turkce = sc.nextInt();

        System.out.println("turkce notunuz:");
        tarih = sc.nextInt();

        System.out.println("muzık notunuz:");
        muzik = sc.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ort = toplam / 6.0;
        if (ort <= 55) {
            System.out.println("sınıfta kaldınız ");
        } else {
            System.out.println("sınıfı geçtiniz");
            System.out.println("ortalamanız:" + ort);
        }

    }
}
