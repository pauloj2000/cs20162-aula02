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

public class LogaritmoNaturalTest {
    
    LogaritmoNatural x;
        
    public LogaritmoNaturalTest() {
        x = new LogaritmoNatural();
    }
    
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