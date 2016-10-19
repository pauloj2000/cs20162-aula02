/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

import org.junit.Test;

/**
 *
 * @author aluno
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
