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

public class Exercicio5Test {
    
    Exercicio5 x;
    
    public Exercicio5Test() {
        x = new Exercicio5();
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
