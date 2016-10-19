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
