/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioCpf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo_000
 */
public class CpfTest {
    
    public CpfTest() {
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
     * Test of cpfTipo1 method, of class Cpf.
     */
    @Test
    public void testCpfTipo1() {
        System.out.println("cpfTipo1");
        int[] d = null;
        boolean expResult = false;
        boolean result = Cpf.cpfTipo1(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cpfTipo2 method, of class Cpf.
     */
    @Test
    public void testCpfTipo2() {
        System.out.println("cpfTipo2");
        int[] d = null;
        boolean expResult = false;
        boolean result = Cpf.cpfTipo2(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cpfTipo3 method, of class Cpf.
     */
    @Test
    public void testCpfTipo3() {
        System.out.println("cpfTipo3");
        int[] d = null;
        boolean expResult = false;
        boolean result = Cpf.cpfTipo3(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
