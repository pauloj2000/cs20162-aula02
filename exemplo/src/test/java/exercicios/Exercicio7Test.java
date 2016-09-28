/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

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
