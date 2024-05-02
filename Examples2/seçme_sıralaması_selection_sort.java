package Examples2;

import java.util.Scanner;

public class seçme_sıralaması_selection_sort {//i son sayıya kadar gitmediği için n-1 e kadar gider.J de i+1 den başlar

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n uzunluğunu gir:");
        int n = sc.nextInt();
        int A[] = new int[n];//diziyi oluşturma                                 KULLANICIDAN DİZİNİN ELEMANLARI ALINIYOR
        for (int i = 0; i < n; i++) {
            System.out.println("lütfen" + (i+1) + ".elemanı girin");
            A[i] = sc.nextInt();

        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(A[i]>A[j]){
                int tmp=A[i];
                A[i]=A[j];  
                A[j]=tmp;
                }
            }
        }
        yazdir(A);
        
    }
    static void yazdir(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");                                   //DİZİYİ YAZDIRMA METODU
        }
    
    }
}
