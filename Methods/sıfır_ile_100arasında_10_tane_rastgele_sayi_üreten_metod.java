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
public class sıfır_ile_100arasında_10_tane_rastgele_sayi_üreten_metod {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        int[] a = randomarray(10, 100);//------------------------------------------qwabu ikisinin ilişkisi yoktur ikiside farklı metodlarda aynı isimde olabilir ilişki yok aralarında
        arrayYazdırma(a);//a dizisini yazdırma
    }

    static int[] randomarray(int N, int ub) {
        int a[] = new int[N];//---------------------------------------------------bu ikisinin ilişkisi yoktur ikiside farklı metodlarda aynı isimde olabilir ilişki yok aralarında
        for (int i = 0; i < N; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

     static void arrayYazdırma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

}

