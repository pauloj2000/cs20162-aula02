/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

import org.junit.Test;

/**
 *
 * @author Alunoinf_2
 */
public class Exercicio7Test {
    
    public Exercicio7Test() {
    }
    @Test(expected = IllegalArgumentException.class)
    public void nIgualA1(){
        int vetor[] = new int[10];
        Exercicio7.crivoEratostenes(vetor,1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQue1(){
        int vetor[] = new int[10];
        Exercicio7.crivoEratostenes(vetor,0);
    }
}
