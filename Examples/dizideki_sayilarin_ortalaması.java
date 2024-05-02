package Examples;
public class dizideki_sayilarin_ortalaması {

    public static void main(String[] args) {
        int [] dizi ={17,25,19,3,47};
        int top=0 ,ort=0;
        for (int i = 0; i < dizi.length; i++) {
            top+=dizi[i];
            
        }
        ort=top/dizi.length;
        System.out.println("ortalama"+ort);
    }
    
}
