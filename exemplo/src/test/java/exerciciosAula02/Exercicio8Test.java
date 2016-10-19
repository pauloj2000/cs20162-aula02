/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

import org.junit.Test;

/**
 * Testes dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class Exercicio8Test {
    
    public Exercicio8Test() {
    }
    
    /**
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void nIgualA1(){
        Exercicio8.numeroHarmonico(1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue1(){
        Exercicio8.numeroHarmonico(-3);
    }
}
