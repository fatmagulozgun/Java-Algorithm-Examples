package Examples;

public class dizideki_tekrar_eden_cift_sayıları_bul {

    public static void main(String[] args) {
        int[] dizi = {31, 12, 80, 45, 75, 31, 12, 3, 80}; // ---->i =31  j=12 
        int tekrarEden = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 1; j < dizi.length; j++) {
                if (dizi[i]%2==0 && dizi[j]%2==0 && dizi[i] == dizi[j] && i!=j ) {
                    System.out.print(dizi[i]+ ",");
                }
            }
        }
        
    }

}
