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

public class Exercicio3Test {
    
    Exercicio3 x;
    
    public Exercicio3Test() {
        x = new Exercicio3();
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
