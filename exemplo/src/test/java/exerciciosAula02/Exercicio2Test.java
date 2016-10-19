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
    
    Exercicio2 x;
    
    public Exercicio2Test() {
        x = new Exercicio2();
    }

    @Test
    public void testProdutoAMaior() {
        assertEquals(6,Exercicio2.produtoUsandoSoma(3, 2));
    }
    
    @Test
    public void testProdutoBMaior() {
        assertEquals(6,Exercicio2.produtoUsandoSoma(2, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatorANegativo() {
        Exercicio2.produtoUsandoSoma(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatorBNegativo() {
        Exercicio2.produtoUsandoSoma(2, -3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testProdutoFatoresNegativo() {
        Exercicio2.produtoUsandoSoma(-2, -3);
    }
}
