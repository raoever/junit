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
        if(b > 0 && a % b == 0){
            return b;
        }
        return -1;
    }
}
