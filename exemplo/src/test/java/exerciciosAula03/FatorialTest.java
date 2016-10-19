/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class FatorialTest {
    
    Fatorial p;
    
    public FatorialTest() {
        p = new Fatorial();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        Fatorial.calcularFatorial(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nZero(){
        Fatorial.calcularFatorial(0);
    }
    
    @Test
    public void testFatorial2() {
        int n = 1;
        int expResult = 1;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial3() {
        int n = 2;
        int expResult = 2;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial4() {
        int n = 3;
        int expResult = 6;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial5() {
        int n = 4;
        int expResult = 24;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial6() {
        int n = 5;
        int expResult = 120;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial7() {
        int n = 6;
        int expResult = 720;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFatorial8() {
        int n = 7;
        int expResult = 5040;
        int result = Fatorial.calcularFatorial(n);
        assertEquals(expResult, result);
    }
}