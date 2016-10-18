/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

import exerciciosAula02.Exercicio5;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Exercicio5Test {
    
    public Exercicio5Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue0(){
        Exercicio5.propriedade153(-2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue9999(){
        Exercicio5.propriedade153(100000000);
    }
    
    @Test
    public void testPropriedade153() {
        int n = 153;
        boolean expResult = true;
        boolean result = Exercicio5.propriedade153(n);
        assertEquals(expResult, result);
    }
    
    public void secondTestPropriedade3025() {
        int n = 154;
        boolean expResult = false;
        boolean result = Exercicio5.propriedade153(n);
        assertEquals(expResult, result);
    }
    
}
