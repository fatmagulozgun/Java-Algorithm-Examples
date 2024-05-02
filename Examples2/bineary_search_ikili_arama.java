package Examples2;

public class bineary_search_ikili_arama {

    public static void main(String[] args) {
        int[] dizi = {1, 3, 5, 7, 9};
        int index = binearysearch(dizi, 7);
        System.out.println("index:" + index);

    }

    public static int binearysearch(int[] array, int secilen) {
        int altsınır = 0;
        int üstsınır = array.length - 1;
        while (altsınır <= üstsınır) {
            int orta = altsınır + (üstsınır - altsınır) / 2;
            if (array[orta] == secilen) {
                return orta;
            } else if (array[orta] < secilen) {
                altsınır = orta + 1;
            } else if (array[orta] > secilen) {
                üstsınır = orta - 1;
            }
        }
        return -1;
    }

}
