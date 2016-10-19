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
public class LogaritmoNaturalTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        LogaritmoNatural.logNatural(0, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void kMenorQueDois(){
        LogaritmoNatural.logNatural(2, 0);
    }
    
    @Test
    public void testLogNat() {
        double a = 1;
        double b = 2;
        double expResult = 3.0f;
        double result = LogaritmoNatural.logNatural(a, b);
        assertEquals(expResult, result, 0.0);
    }
}