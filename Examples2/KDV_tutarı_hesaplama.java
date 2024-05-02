package Examples2;

import java.util.Scanner;

public class KDV_tutarı_hesaplama {
   
    //kdv tutarı %18 oalrak alını ,kdvsiz fiyat=10 ,kadvli fiyat=11.8 ,kdv tutarı=1.8  
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner sc=new Scanner(System.in);
        System.out.println("tutarı girin :");
        tutar=sc.nextInt();
        double kdvTutar=tutar*kdvOran;
        double kdvlitutar=tutar+kdvTutar;
        System.out.println(kdvlitutar);
    }
    
}
