package Loops;

public class yıldızlar_ile_üçgen_yapma {

    public static void main(String[] args) {
        //           *         5b 1y           
        //          ***        4b 3y           
        //         *****       3b 5b          6 satır
        //        *******      2b 7y     
        //       *********     1b 9y    
        //      ***********    0b 11y    

        int yildiz=1;
        int satir=6;
        int bos=satir-1;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < bos; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            bos--;
            yildiz=yildiz+2;
            
        }
        

    }

}
