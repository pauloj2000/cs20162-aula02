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
public class QuadradoPerfeitoTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void kMenorQueUm(){
        QuadradoPerfeito.quadradoPerfeito(-1);
    }
    
    @Test
    public void testQuadPerfeito() {
        int n = 1;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito2() {
        int n = 10;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito3() {
        int n = 144;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito4() {
        int n = 64;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito5() {
        int n = 2;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito6() {
        int n = 9;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testQuadPerfeito7() {
        int n = 3;
        boolean expResult = false;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testQuadPerfeito8() {
        int n = 25;
        boolean expResult = true;
        boolean result = QuadradoPerfeito.quadradoPerfeito(n);
        assertEquals(expResult, result);
    }
}