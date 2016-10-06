/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import primeirosExercicios.Exercicio6;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
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
