package Methods;

public class test {

    public static void main(String[] args) {
        int[] notlar={5,10,1,4};
        System.out.println(ort(notlar));
  
    } 
    
    public static int ort( int [] notlar){
      int ort=0;
        for (int i = 0; i < notlar.length; i++) {
            ort=notlar[i]/notlar.length;
        }
        
       return ort; 
    }
    
    }


