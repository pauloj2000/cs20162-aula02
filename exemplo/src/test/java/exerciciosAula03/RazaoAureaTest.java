/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo_000
 */
public class RazaoAureaTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void xMenorQueZero(){
        RazaoAurea.razaoAurea(-2, 2, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void yMenorQueZero(){
        RazaoAurea.razaoAurea(2, -5, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void xMenorQueY(){
        RazaoAurea.razaoAurea(1, 5, 4);
    }
    
    @Test
    public void testRazaoAurea() {
        int x = 0;
        int y = 1;
        int z = 1;
        double expResult = 1.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea2() {
        int x = 0;
        int y = 1;
        int z = 2;
        double expResult = 2.0;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea3() {
        int x = 1;
        int y = 2;
        int z = 3;
        double expResult = 1.6;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea4() {
        int x = 1;
        int y = 2;
        int z = 2;
        double expResult = 1.6666666666666667;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea5() {
        int x = 0;
        int y = 5;
        int z = 5;
        double expResult = 1.6;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea6() {
        int x = 0;
        int y = 10;
        int z = 15;
        double expResult = 1.618032786885246;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea7() {
        int x = 6;
        int y = 9;
        int z = 10;
        double expResult = 1.6180257510729614;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea8() {
        int x = 2;
        int y = 4;
        int z = 8;
        double expResult = 1.6181818181818182;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testRazaoAurea9() {
        int x = 64;
        int y = 99;
        int z = 1;
        double expResult = 1.6464646464646464;
        double result = RazaoAurea.razaoAurea(x, y, z);
        assertEquals(expResult, result, 0.0);
    }
}