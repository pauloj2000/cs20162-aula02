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

public class RaizQuadradaTest {
    
    RaizQuadrada r;
    
    public RaizQuadradaTest() {
        r = new RaizQuadrada();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorIgualAZero(){
        RaizQuadrada.raizQuadrada(0, 0);
    }
    
    @Test
    public void testRaizQuadrada() {
        int n = 81;
        int i = 9;
        double expResult = 9;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada2() {
        int n = 7;
        int i = 7;
        double expResult = 2.6457513110645907;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada3() {
        int n = 81;
        int i = 4;
        double expResult = 9.014272376994608;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada4() {
        int n = 49;
        int i = 7;
        double expResult = 7.0;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada5() {
        int n = 25;
        int i = 3;
        double expResult = 5.015247601944898;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada6() {
        int n = 9;
        int i = 2;
        double expResult = 3.023529411764706;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada7() {
        int n = 9;
        int i = 5;
        double expResult = 3.0;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testRaizQuadrada8() {
        int n = 2;
        int i = 1;
        double expResult = 1.4166666666666665;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRaizQuadrada9() {
        int n = 2;
        int i = 3;
        double expResult = 1.4142135623746899;
        double result = RaizQuadrada.raizQuadrada(n, i);
        assertEquals(expResult, result, 0.0);
    }
}