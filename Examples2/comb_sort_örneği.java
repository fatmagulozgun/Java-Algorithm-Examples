package Examples2;

public class comb_sort_örneği {

    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 4};
        System.out.println("comb sort öncesi:");
        printarray(a);
        System.out.println();
        System.out.println("comb sort sonrası:");
        combSort(a);
        printarray(a);
    }

    public static int[] combSort(int[] array) {
        int n = array.length;
        int mesafe = n;
        boolean yerdegistirme = true;
        while (mesafe != 1 || yerdegistirme) {
            mesafe = sonraki_boslugu_alma(mesafe);
            yerdegistirme = false;
            for (int i = 0; i < n - mesafe; i++) {
                if (array[i] > array[i + mesafe]) {
                    int tmp = array[i];
                    array[i] = array[i + mesafe];
                    array[i + mesafe] = tmp;
                    yerdegistirme = true;
                }
            }

        }
        return array;

    }

    static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();

    }

    private static int sonraki_boslugu_alma(int mesafe) {
        mesafe = (mesafe * 10) / 13;
        if (mesafe < 1) {
            return 1;
        }
        return mesafe;
    }
}
