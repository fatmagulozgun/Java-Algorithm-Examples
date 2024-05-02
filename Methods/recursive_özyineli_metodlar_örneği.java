/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author user
 */
public class recursive_özyineli_metodlar_örneği {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bu teknik karmaşık problemleri,çözmesi dha kolay problemlere ayırmayı sağlar.Her zaman RETURN kullanılır
        //f(1)=1
        //f(2)=f(1)+1
        //f(3)=f(2)+3
        //   .
        //   .
        //f(x)=f(x-1)+x -------------> return da buna göre işlem yap
        System.out.println(f(10));        
    }
    static int f(int x){
    if(x==1){
    return 1;
    }
    return x+f(x-1);
    }
    
}
