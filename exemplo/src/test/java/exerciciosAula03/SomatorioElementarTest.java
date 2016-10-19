/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class SomatorioElementarTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        SomatorioElementar.somaNaturais(0);
    }
    
    public SomatorioElementarTest() {
    }

    /**
     * Teste com somatorio valido
     */
    @Test
    public void testSomaNaturaisValido() {
        assertEquals(1.8972, SomatorioElementar.somaNaturais(5), 9);
    }
    
    /**
     * Teste com somatorio invalido
     */
    @Test (expected = IllegalArgumentException.class)
    public void testSomaNaturaisInvalido() {
        SomatorioElementar.somaNaturais(-5);
    }
}
