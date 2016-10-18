/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemServiço;

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
public class DiaDaSemanaTest {
    
    public DiaDaSemanaTest() {
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
     * Test of entradaData method, of class DiaDaSemana.
     */
    @Test
    public void testEntradaData() {
        System.out.println("entradaData");
        int dataConhecida = 0;
        int anoBissexto = 0;
        int dataDesejada = 0;
        int diaDaSemana = 0;
        DiaDaSemana instance = new DiaDaSemana();
        int expResult = 0;
        int result = instance.entradaData(dataConhecida, anoBissexto, dataDesejada, diaDaSemana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descobrirBissextos method, of class DiaDaSemana.
     */
    @Test
    public void testDescobrirBissextos() {
        System.out.println("descobrirBissextos");
        int ano = 0;
        DiaDaSemana instance = new DiaDaSemana();
        instance.descobrirBissextos(ano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
