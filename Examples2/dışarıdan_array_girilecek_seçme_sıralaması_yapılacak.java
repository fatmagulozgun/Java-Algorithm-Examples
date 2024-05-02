
package Examples2;

public class dışarıdan_array_girilecek_seçme_sıralaması_yapılacak {

   
    public static void main(String[] args) {
        // DIŞARDAN GİRİLEN ARRAY SELECTİON İLE SIRALANACAK.1-arrayı metod ile tanımla  2-arrayı yazdir
        int[] array = {5, 3, 1, 12, 8, 6, 7};
        System.out.println("sorting öncesi");
        arrayyazdirma(array);

        System.out.println();
        System.out.println("sorting sonrası");
        siralama(array);//ilk önce sıralamayı yapsın
        arrayyazdirma(array);//sıralamadan sonra yeni diziyi yazdir
    }

    static int[] randomarray(int N, int ub) {//diziyi tanımla.BURADA parantez içerinde dizi tanımlaması yok sınırlar var
        int[] dizi = new int[N];//------------------------------------------------->yukarıda dizi tanımlanmadığı için burada dizi tanımlanır
        for (int i = 0; i < N; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        return dizi;
    }

    static void arrayyazdirma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

    static int[] siralama(int[] array) {//----------------------------------------->burada dizi tanımlanmış.o yüzden aşağıda tekrardan dizi tanımlanmaz

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

}
