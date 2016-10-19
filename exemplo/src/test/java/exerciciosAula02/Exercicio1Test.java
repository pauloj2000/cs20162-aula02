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

public class Exercicio1Test {
    
    public Exercicio1Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        Exercicio1.somaNaturais(0);
    }
    
    @Test
    public void testeDo2(){
        assertEquals(3, Exercicio1.somaNaturais(2));
    }
    
    @Test
    public void cemPorCento(){
        new Exercicio1();
    }

    /**
     * Test of somaNaturais method, of class Exercicio1.
     */
    
}
