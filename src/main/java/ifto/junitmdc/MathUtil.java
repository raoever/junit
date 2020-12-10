/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifto.junitmdc;

/**
 *
 * @author rene
 */
public class MathUtil {
    public static int mdc(int a, int b){
        //Propriedade 6
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propriedade 1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //Propriedade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        //Propriedade 12
        if(ePrimo(a) && a%b == 0){
            return b;
        } else if(ePrimo(b) && a%b == 0){
            return b;
        } 
        
        //Propriedade 5
        if (a % b !=0){
            return 1;
        }
        
        return -1;
    }
    
    public static boolean mdc(int a, int b, int c){
        return mdc(mdc(a,b), c) == mdc(a, mdc(b,c));
    }
    
    private static boolean ePrimo(int numero) {
    for (int j = 2; j < numero; j++) {
        if (numero % j == 0)
            return false;   
    }
    return true;
}
    
}
