
package Examples2;

public class linear_search_doğrusal_arama {

    public static void main(String[] args) {
        int[] dizi = {1, 3, 5, 7, 9};
        int index = linearsearch(dizi, 7);
        System.out.println("index:" + index);
    }

    public static int linearsearch(int[] array, int secilen) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == secilen)
            {
                return i;
            }
        }
        return -1;
    }

}
