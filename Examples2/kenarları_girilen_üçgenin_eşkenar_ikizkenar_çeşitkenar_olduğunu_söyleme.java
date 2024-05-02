package Examples2;

import java.util.Scanner;

public class kenarları_girilen_üçgenin_eşkenar_ikizkenar_çeşitkenar_olduğunu_söyleme {

    public static void main(String[] args) {
    Scanner scan =new Scanner (System.in); 
     System.out.println("1.kenarın uzunluğunu girin");
     int say1=scan.nextInt();
     System.out.println("2.kenarın uzunluğunu girin");
     int say2=scan.nextInt();
     System.out.println("3.kenarın uzunluğunu girin");
     int say3=scan.nextInt();
     if ((say1==say2) && (say2==say3) && (say1==say3)){ 
     System.out.println("Eşkenar üçgen");  
     }
     if ((say1!=say2) && (say2!=say3) && (say1!=say3)){ 
     System.out.println("Çeşitkenar üçgen");  
     }  
     if ((say1==say2) && (say2!=say3) || (say1==say3)&& (say3!=say2) || (say2==say3)&& (say3!=say1)){ 
     System.out.println("İkizkenar Üçgen");  
     }
     
    }
    
}
