package Arrays;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {     
    Scanner sc=new Scanner(System.in); 
    
    int liste [] = new int[4];
        for (int i = 0; i < liste.length; i++) {            
            System.out.println((i+1)+"nci elemanı giriniz :");
            liste[i]=sc.nextInt();
        }
        for (int i = 0; i < liste.length; i++) {
            System.out.println("dizideki elemanlar:"+liste[i]);
        }
    
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
