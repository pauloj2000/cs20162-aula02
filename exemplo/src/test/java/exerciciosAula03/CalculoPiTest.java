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

public class CalculoPiTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        CalculoPi.calcularPi(0);
    }
    
    CalculoPi p;
    
    public CalculoPiTest() {
        p = new CalculoPi();
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
        double expResult = 2.666666666666667;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi3() {
        int n = 3;
        double expResult = 3.4666666666666667;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi4() {
        int n = 5;
        double expResult = 3.3396825396825403;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi5() {
        int n = 10;
        double expResult = 3.0418396189294032;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi6() {
        int n = 50;
        double expResult = 3.121594652591011;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi7() {
        int n = 25;
        double expResult = 3.1815766854350325;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalcularPi8() {
        int n = 99;
        double expResult = 3.1516934060711166;
        double result = CalculoPi.calcularPi(n);
        assertEquals(expResult, result, 0.0);
    }
}