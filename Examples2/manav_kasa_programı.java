package Examples2;

import java.util.Scanner;

public class manav_kasa_programı {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double meze = 0.95;
        double patlican = 5.00;
        System.out.print("kaç kilo armut:");
        int a=sc.nextInt();
        System.out.print("kaç kilo elma:");
        int b=sc.nextInt();
        System.out.print("kaç kilo domates:");
        int c=sc.nextInt();
        System.out.print("kaç kilo meze:");
        int d=sc.nextInt();
        System.out.print("kaç kilo patlican:");
        int e=sc.nextInt();
        
        double sonuc=(armut*a)+(elma*b)+(domates*c)+(meze*d)+(patlican*e);
        System.out.println("sonuç:"+sonuc);
        
    }

}
