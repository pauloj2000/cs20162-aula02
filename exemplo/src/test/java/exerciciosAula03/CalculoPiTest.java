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
public class CalculoPiTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        CalculoPi.calcularPi(0);
    }
    
    @Test
    public void testCalcularPi() {
        int n = 1;
        double expResult = 4.0;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi2() {
        int n = 2;
        double expResult = 2.666666626930237;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi3() {
        int n = 3;
        double expResult = 3.4666666388511658;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi4() {
        int n = 5;
        double expResult = 3.33968248963356;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi5() {
        int n = 10;
        double expResult = 3.0418395549058914;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi6() {
        int n = 50;
        double expResult = 3.121594585478306;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi7() {
        int n = 25;
        double expResult = 3.1815766245126724;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi8() {
        int n = 99;
        double expResult = 3.151693342253566;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
}