package Examples2;

public class sıfır_ile_yüz_arasında_rastgele_sayi_üreten_metod {

    public static void main(String[] args) {//0-100arasında tek boyutlu dizi ile 10 tane rastgele sayı üreten metod
        int a[]=randomarray(10,100);
        diziyiyazdirma(a);                                  //kaç ile kaç arasında olacağının yeridir
    }

    static int[] randomarray(int N, int ub) {//N boyutlu bir dizi olsun ve üst sınırı ub olsun
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = (int) (Math.random() * 100);
        }                                                           //BURASI DİZİYİ OLUŞTURMA YERİDİR
        return a;
    }
    
    static void diziyiyazdirma(int[]array){
        for (int i = 0; i < array.length; i++) {                    //BURASI DİZİYİ YAZDIRMA YERİ
            System.out.print(array[i]+",");
        }
    }
}
