/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author user
 */
public class metodlarla_overloading_örneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OVERLOANDİNG:aynı işlemi farklı parametrelerle yapacak olan metod ismini tek seferde kullanmaktır
        System.out.println(metod_ismi(1, 2));
        System.out.println(metod_ismi(1, 2,5));
        System.out.println(metod_ismi(1, 2,9.0));
        System.out.println(metod_ismi(1, 2.0,9));
    }

    static int metod_ismi(int a, int b) {
        System.out.println("1.metod kullanıldı");
        return a + b;
    }

    static int metod_ismi(int a, int b, int c) {
        System.out.println("2.metod kullanıldı");
        return a + b + c;
    }

    static double metod_ismi(int a, int b, double c) {
        System.out.println("3.metod kullanıldı");
        return a + b + c;
    }

    static double metod_ismi(int a, double b, int c) {
        System.out.println("4.metod kullanıldı");
        return a + b + c;
    }
}
