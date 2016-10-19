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

public class RazaoAureaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void xMenorQueZero(){
        RazaoAurea.razaoAurea(-2, 2, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void yMenorQueZero(){
        RazaoAurea.razaoAurea(2, -5, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void xMaiorQueY(){
        RazaoAurea.razaoAurea(5, 1, 4);
    }
    
    @Test
    public void testRazaoAurea() {
        int x = 0;
        int y = 1;
        int z = 1;
        double expResult = 1.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea2() {
        int x = 0;
        int y = 1;
        int z = 2;
        double expResult = 2.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
        @Test
    public void testRazaoAurea3() {
        assertEquals(1.619, RazaoAurea.razaoAurea(0, 1, 30), 0.001);
    }
}