/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo_000
 */
public class FibonacciTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueZero(){
        Fibonacci.calcularFibonacci(-1);
    }
    
    @Test
    public void testFibo() {
        int n = 0;
        int expResult = 0;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibo2() {
        int n = 1;
        int expResult = 1;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFibo3() {
        int n = 2;
        int expResult = 1;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
    @Test
    public void testFibo4() {
        int n = 3;
        int expResult = 2;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibo5() {
        int n = 4;
        int expResult = 3;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibo6() {
        int n = 5;
        int expResult = 5;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibo7() {
        int n = 6;
        int expResult = 8;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFibo8() {
        int n = 7;
        int expResult = 13;
        int result = Fibonacci.calcularFibonacci(n);
        assertEquals(expResult, result);
    }
}