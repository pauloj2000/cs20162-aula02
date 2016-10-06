/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import primeirosExercicios.Exercicio2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Exercicio2Test {
    
    public Exercicio2Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void aMenorQue0(){
        Exercicio2.produtoUsandoSoma(-1, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void bMenorQue0(){
        Exercicio2.produtoUsandoSoma(3, -1);
    }

    /**
     * Test of produtoUsandoSoma method, of class Exercicio2.
     */
    @Test
    public void testProdutoUsandoSoma() {
        int a = 1;
        int b = 1;
        int expResult = 0;
        int result = Exercicio2.produtoUsandoSoma(a, b);
        assertEquals(expResult, result);
    }
    
}
