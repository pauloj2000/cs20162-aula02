/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class Exercicio1Test {
    
    public Exercicio1Test() {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void nMenorQueUm(){
        Exercicio1.somaNaturais(0);
    }
    
    @Test
    public void testeDo2(){
        assertEquals(3, Exercicio1.somaNaturais(2));
    }
    
    @Test
    public void cemPorCento(){
        new Exercicio1();
    }

    /**
     * Test of somaNaturais method, of class Exercicio1.
     */
    
}
