/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exercicioCpf;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo Junio Sales Rodrigues
 */
public class CpfTest {
    
    //Testes para o método "cpfTipo1".
    
    //Teste para um número menor do que o tamanho exigido
    @Test(expected = IllegalArgumentException.class)
    public void cpfMenorInvalido() {
        int d[] = {8,4,8,1,4,3,8,5,9,6};
        Cpf.cpfTipo1(d);
    }
    
    //Teste para um número maior do que o tamanho exigido
    @Test(expected = IllegalArgumentException.class)
    public void cpfMaiorInvalido() {
        int d[] = {8,4,8,1,4,3,8,5,9,6,0,3};
        Cpf.cpfTipo1(d);
    }
    
    //Testes de válidez

    @Test
    public void cpfValido() {
        int d[] = {8,4,8,1,4,3,8,5,9,6,0};
        assertEquals(true, Cpf.cpfTipo1(d));
    }
    
    @Test
    public void cpfInvalido1() {
        int d[] = {8,4,1,1,4,3,8,5,9,6,0};
        assertEquals(false, Cpf.cpfTipo1(d));
    }
    
    @Test
    public void cpfInvalido2() {
        int d[] = {5,5,5,4,1,7,6,4,8,0,2};
        assertEquals(false, Cpf.cpfTipo1(d));
    }
    
    @Test
    public void cpfInvalido3() {
        int d[] = {5,5,5,4,1,7,6,4,8,8,0};
        assertEquals(false, Cpf.cpfTipo1(d));
    }
    
    //Testes para o método "cpfTipo2".
    
    //Teste para um número menor do que o tamanho exigido
    @Test(expected = IllegalArgumentException.class)
    public void cpf2MenorInvalido() {
        int d[] = {0,8,4,8,1,4,3,8,5};
        Cpf.cpfTipo2(d);
    }
    
    //Teste para um número maior do que o tamanho exigido
    @Test(expected = IllegalArgumentException.class)
    public void cpf2MaiorInvalido() {
        int d[] = {0,8,4,8,1,4,3,8,5,9,6,0,2};
        Cpf.cpfTipo2(d);
    }
    
    //Testes de válidez
    @Test
    public void cpf2Valido() {
        int d[] = {0,8,4,8,1,4,3,8,5,9,6,0};
        assertEquals(true, Cpf.cpfTipo2(d));
    }
    
    @Test
    public void cpf2Invalido() {
        int d[] = {0,8,4,1,1,4,3,8,5,9,6,0};
        assertEquals(false, Cpf.cpfTipo2(d));
    }
    
    @Test
    public void cpf2Invalido2() {
        int d[] = {0,5,5,5,4,1,7,6,4,8,0,2};
        assertEquals(false, Cpf.cpfTipo2(d));
    }
    
    @Test
    public void cpf2Invalido3() {
        int d[] = {0,5,5,5,4,1,7,6,4,8,8,0};
        assertEquals(false, Cpf.cpfTipo2(d));
    }
}