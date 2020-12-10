/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifto.junitmdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ifto.junitmdc.MathUtil.mdc;

/**
 *
 * @author rene
 */
class MathUtilTest {

    @Test
    void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor ==0);
    }
    
    @Test
    void testMdAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a*b, c);
        final int obtido = mdc(b, c);
        System.out.println("Esperado: "+esperado+" Obtido: "+obtido);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = mdc(b, c);
        System.out.println("Esperado: "+esperado+" Obtido: "+obtido);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
//    você deve implementar as propriedades 8, 9 e 12.
    @Test
    void testMdcP8(){
        final int a = 6;
        final int esperado = 6;
        final int obtido = mdc(a, a);
        assertEquals(esperado, obtido);
    }
    
    void testMdcP9(){
        final int a = 9;
        final int b = 5;
        final int c = 7;
        final boolean esperado = mdc(a, mdc(b, c)) == mdc(mdc(a,b),c);
        final boolean obtido = mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcPrimoMaiorQAP12(){
        final int a = 4;
        final int p = 13;
        final int esperado = 1;
        final int obtido = mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAMaiorQPrimoDivisivelP12(){
        final int a = 10;
        final int p = 5;
        final int esperado = 5;
        final int obtido = mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAMaiorQPrimoNaoDivisivelP12(){
        final int a = 9;
        final int p = 5;
        final int esperado = 1;
        final int obtido = mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAPPrimosP12(){
        final int a = 13;
        final int p = 5;
        final int esperado = 1;
        final int obtido = mdc(p, a);
        assertEquals(esperado, obtido);
    }
    
}
