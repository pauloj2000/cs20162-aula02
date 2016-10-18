/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

import exerciciosAula02.Exercicio4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunoinf_2
 */
public class Exercicio4Test {
    
    public Exercicio4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of propriedade3025 method, of class Exercicio4.
     */
    @org.junit.Test
    public void testPropriedade3025() {
        System.out.println("propriedade3025");
        int n = 0;
        boolean expResult = false;
        boolean result = Exercicio4.propriedade3025(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
