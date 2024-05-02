package Examples2;

public class sıfır_ile_yüz_arasında_rastgele_sayi_çift_boyutlu_dizi {

    public static void main(String[] args) {//0-100arasında çift boyutlu dizi ile n*n boyutlu kare matris olacak.10 tane rastgele sayı üreten metod
        int[][]a =a(10,100);
        diziyiyazdirma(a);                                              //kaç ile kaç arasında olacağının yeridir
    }

    static int[][] a(int N, int ub) {//1-diziyi oluşturma yeridir
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (int) (Math.random() * 100);//sıfır ile 100 arasında
            }
        }
        return a;
    }
    static void diziyiyazdirma(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+",");
            }
            System.out.println();
        }
    }
}
