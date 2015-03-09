
package numeroprimo;
import java.util.*;

public class Numeroprimo {

   
    public static void main(String[] args) {
      
        Scanner lec= new Scanner(System.in);
        
        int n,c=1,sp=0;
        System.out.println("introduzca un numero");
        n=lec.nextInt();
        
        while(c<=n){
             if(n%c==0){
                    sp++;    c++;
                    
        } else      c++;
        }
        
             if(sp==2){
               System.out.println("el numero es primo");
        
        } else System.out.println("el numero no es primo");
    }  
}
