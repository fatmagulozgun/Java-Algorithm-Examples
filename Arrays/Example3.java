package Arrays;

import java.util.Scanner;

public class Example3 {
//dizideki_elemanların_ortalaması

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kaç elemanlı dizi istiyorsun:");
        int n =sc.nextInt();
        int dizi[] = new int[n];
        System.out.println("ortalama:"+ort(dizi));
    }
    
    public static int ort(int [] dizi){
        Scanner sc = new Scanner(System.in);
        int ort=0;
        int top=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("lütfen"+(i+1)+"nci değeri gir");
            dizi[i]=sc.nextInt();
            top+=dizi[i];
            ort=top/dizi.length;
        }
        return ort;
    } 
}
