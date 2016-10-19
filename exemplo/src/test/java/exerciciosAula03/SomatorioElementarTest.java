/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo_000
 */
public class SomatorioElementarTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        SomatorioElementar.somaNaturais(0);
    }
    
    @Test
    public void testSomaNaturais() {
        int n = 1;
        double expResult = 0.5;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais2() {
        int n = 2;
        double expResult = 0.7000000029802322;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais3() {
        int n = 3;
        double expResult = 0.7000000029802322;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais4() {
        int n = 9;
        double expResult = 0.7742081480100751;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais5() {
        int n = 10;
        double expResult = 0.7742081480100751;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
   
    @Test
    public void testSomaNaturais6() {
        int n = 21;
        double expResult = 0.7780991985928267;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais7() {
        int n = 100;
        double expResult = 0.77931888938474;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSomaNaturais8() {
        int n = 50;
        double expResult = 0.7790748083498329;
        double result = SomatorioElementar.somaNaturais(n);
        assertEquals(expResult, result, 0.0);
    }
}
