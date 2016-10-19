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

public class Exercicio6Test {
    
    Exercicio6 x;
    
    public Exercicio6Test() {
        x = new Exercicio6();
    }
    
        @Test(expected = IllegalArgumentException.class)
    public void numeroNegativoInvalidoPrimo() {
        Exercicio6.numeroPrimo(-2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoPrimo1() {
        Exercicio6.numeroPrimo(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numeroInvalidoPrimo2() {
        Exercicio6.numeroPrimo(1);
    }
    
    @Test
    public void numeroValidoPrimo1() {
        assertEquals(true, Exercicio6.numeroPrimo(2));
    }
    
    @Test
    public void numeroValidoPrimo2() {
        assertEquals(false, Exercicio6.numeroPrimo(6));
    }
    
    @Test
    public void numeroValidoPrimo3() {
        assertEquals(true, Exercicio6.numeroPrimo(11));
    }
    
}
