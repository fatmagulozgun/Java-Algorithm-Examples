package Examples;

public class dizideki_elemanların_max_min_bulma {

    public static void main(String[] args) {
        int[] dizi = {17, 25, 19, 3, 47};
        int max = dizi[0];
        int min = dizi[0];
        for (int i : dizi) {
            if (dizi[i] < min) {
                min = dizi[i];               
            }
            if (dizi[i] > max) {
                max = dizi[i];                
            }          
        }
        System.out.println("max sayi" + max);
        System.out.println("min sayi" + min);
    }

}
