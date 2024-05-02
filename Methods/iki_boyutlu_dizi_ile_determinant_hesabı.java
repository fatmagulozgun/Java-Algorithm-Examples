package Methods;

public class iki_boyutlu_dizi_ile_determinant_hesabı {

    public static void main(String[] args) {
// Örnek bir 2x2 matris oluşturalım
        int[][] matris = {{5, 4}, {7, 8}};

        // determinant fonksiyonunu çağırarak sonucu yazdıralım
        determinant(matris);
    }

    static void determinant(int[][] array) {
        int det = (array[0][0] * array[1][1]) - (array[0][1] * array[1][0]);
        System.out.println("Determinant: " + det);
    }
}
