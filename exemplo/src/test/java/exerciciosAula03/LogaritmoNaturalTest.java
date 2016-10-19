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
        double expResult = 2.5f;
        double result = LogaritmoNatural.logNatural(a, b);
        assertEquals(expResult, result, 0.0);
    }
}