/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class Exercicio6Test {
    
    public Exercicio6Test() {
    }
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void nMenorIgualA1(){
        Exercicio6.numeroPrimo(1);
    }
    
    @Test
    public void testNumeroPrimo() {
        int n = 13;
        boolean expResult = true;
        boolean result = Exercicio6.numeroPrimo(n);
        assertEquals(expResult, result);
    }
    
    public void secondTestNumeroPrimo() {
        int n = 14;
        boolean expResult = false;
        boolean result = Exercicio6.numeroPrimo(n);
        assertEquals(expResult, result);
    }
    
}
