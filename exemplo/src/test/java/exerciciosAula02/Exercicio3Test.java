/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

import exerciciosAula02.Exercicio3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Exercicio3Test {
    
    public Exercicio3Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void xMenorQue0(){
        Exercicio3.potenciaUsandoSoma(-2, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void yMenorQue0(){
        Exercicio3.potenciaUsandoSoma(0, -2);
    }
    
    @Test
    public void testPotenciaUsandoSoma() {
        int x = 2;
        int y = 2;
        int expResult = 4;
        int result = Exercicio3.potenciaUsandoSoma(x, y);
        assertEquals(expResult, result);
    }
    
}
