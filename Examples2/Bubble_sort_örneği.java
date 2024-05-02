package Examples2;

public class Bubble_sort_örneği {

    public static void main(String[] args) {//1-dizi tanımlama 2-dizi yazdirma 3-bubble sort metodu ile karşılaştırma
        int []a={15,4,8,64,12};
        System.out.println("bubble sort öncesi:");
        diziyazdirma(a);
        System.out.println();
        System.out.println("bubble sort sonrası:");
        bubblesort(a);
        diziyazdirma(a);
    }

    static int[] dizi(int n, int ub) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        return a;
    }

    static void diziyazdirma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    static int[] bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

}
