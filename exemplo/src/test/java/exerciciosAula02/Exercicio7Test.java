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

public class Exercicio7Test {
    
    Exercicio7 crivo;
    int a[];
    
    public Exercicio7Test() {
        crivo = new Exercicio7();
    }
    
    @Test
    public void testCrivoEratostenes() {
        a = new int[20];
        int n = 5;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        int[] b = new int[20];
        b[4] = 1;
        assertArrayEquals(b, Exercicio7.crivoEratostenes(a, n));
        
    }
    
        @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalido() {
        a = new int[10];
        int n = 3;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        a[2] = 1;
        int[] b = new int[10];
        
       assertArrayEquals(b, Exercicio7.crivoEratostenes(a, n));
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testCrivoEratostenesInvalido2() {
        a = new int[10];
        int n = -3;
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        int[] b = new int[10];
        
       assertArrayEquals(b, Exercicio7.crivoEratostenes(a, n));
        
    }
}
