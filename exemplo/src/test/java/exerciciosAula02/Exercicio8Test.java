/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

import exerciciosAula02.Exercicio8;
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
