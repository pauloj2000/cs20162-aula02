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

public class Exercicio8Test {
    
    Exercicio8 h;
    
    public Exercicio8Test() {
        h = new Exercicio8();
    }

    @Test
    public void testNumeroHarmonico() {
        assertEquals(2.2833335, Exercicio8.numeroHarmonico(5),1);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNumeroHarmonicoInvalido() {
        Exercicio8.numeroHarmonico(0);
    }
    
}