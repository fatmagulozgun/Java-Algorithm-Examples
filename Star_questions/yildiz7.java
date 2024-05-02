package Star_questions;

public class yildiz7 {

    public static void main(String[] args) { 
 /*
        
    *****  
    *   *
    *   *
    *   *
    *****
        
    */
    int satir=5;
    for(int i=0;i<satir;i++){//satır foru
        for(int j=0;j<satir;j++){// sutün foru 
            if(i==0 || i==satir ||j==0 || j==satir){
            System.out.print("*");            
            }
        else
            {
             System.out.print(" "); 
            
            }
        }
        System.out.println();
    }
    
    
    }}
