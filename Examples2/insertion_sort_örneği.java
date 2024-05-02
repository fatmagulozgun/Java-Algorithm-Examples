package Examples2;

public class insertion_sort_örneği {

    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 4};
        System.out.println("insertion öncesi:");
        printarray(a);
        System.out.println();
        System.out.println("insertion sonrası:");
        combSort(a);
        printarray(a);
    }

    public static int[] combSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;

        }
        return array;
    }

    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

    }

}
