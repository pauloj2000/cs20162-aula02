/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Testes dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class Exercicio4Test {
    
    public Exercicio4Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue0(){
        Exercicio4.propriedade3025(-2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMaiorQue9999(){
        Exercicio4.propriedade3025(100000000);
    }
    
    @Test
    public void testPropriedade3025() {
        int n = 3025;
        boolean expResult = true;
        boolean result = Exercicio4.propriedade3025(n);
        assertEquals(expResult, result);
    }
    
    public void secondTestPropriedade3025() {
        int n = 155;
        boolean expResult = false;
        boolean result = Exercicio4.propriedade3025(n);
        assertEquals(expResult, result);
    } 
}
