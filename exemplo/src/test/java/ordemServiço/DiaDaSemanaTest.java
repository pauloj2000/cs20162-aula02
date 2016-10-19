/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package ordemServiço;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste do método para identificação do dia da semana de uma data
 * a partir de outra data considerando várias restrições.
 * 
 * @author Paulo Junio Sales Rodrigues
 */
public class DiaDaSemanaTest {
    
    DiaDaSemana cemporcento;
    
    public DiaDaSemanaTest() {
        cemporcento = new DiaDaSemana();
    }
    
    @Test
    public void anoInvalido1(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(2010101, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido2(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(100000101, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido3(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161301, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido4(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20160001, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido5(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20160931, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido6(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20150229, 1, 20161005, 0));
    }
    
    @Test
    public void anoInvalido7(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20160900, 1, 20161005, 0));
    }
    
    @Test
    public void bissextoInválidoZero(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 0, 20161005, 0));
    }
    
    @Test
    public void bissextoInválidoNegativo(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005,-100, 20161005, 0));
    }
    
    @Test
    public void anoInvalido8(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 2010101, 0));
    }
    
    @Test
    public void anoInvalido9(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 100000101, 0));
    }
    
    @Test
    public void anoInvalido10(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 20161301, 0));
    }
    
    @Test
    public void anoInvalido11(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 20160001, 0));
    }
   
    
    @Test
    public void diaDaSemanaInvalidoNegativo(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 20161005, -1));
    }
    
    @Test
    public void diaDaSemanaInvalidoPositivo(){
        assertEquals(-1,DiaDaSemana.diaDaSemana(20161005, 1, 20161005, 7));
    }
    
    @Test
    public void quartaFeira1(){
        assertEquals(2,DiaDaSemana.diaDaSemana(20160928, 2016, 20160928, 2));
    }
    
    @Test
    public void quartaFeira2(){
        assertEquals(2,DiaDaSemana.diaDaSemana(20160928, 2016, 20160901, 3));
    }
    
    @Test
    public void quintaFeira(){
        assertEquals(3,DiaDaSemana.diaDaSemana(20160901, 2016, 20160928, 2));
    }
    
    @Test
    public void borne(){
        assertEquals(3,DiaDaSemana.diaDaSemana(19950330, 2016, 20160928, 2));
    }
    
    @Test
    public void milenio(){
        assertEquals(2,DiaDaSemana.diaDaSemana(20160928, 2016, 19950330, 3));
    }    
}