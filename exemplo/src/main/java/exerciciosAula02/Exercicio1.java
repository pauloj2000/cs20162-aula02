/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

/**
 * Implementação dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class Exercicio1 {

    /**
     * Método que resulta na soma dos primeiros números naturais.
     * @param n É o número inteiro à ser feito o somatório.
     * @return Resultado do somatório.
     */
    public static int somaNaturais( int n ) throws IllegalArgumentException {
        int i = 1,s = 2;
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        while( i < n ){
            s = s + i;
            i = i + 1;
        }
        return s;
    }
    
}
