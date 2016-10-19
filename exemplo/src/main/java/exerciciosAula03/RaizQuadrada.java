/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula03;

/**
 * Implementação dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class RaizQuadrada {

    /**
     * Método que descobre a raíz quadrada de um número.
     * @param n Número que se deseja descobrir a raíz quadrada.
     * @param i Parâmetro para descobrir a raíz.
     * @return A raíz quadrada do número.
     */
    public static double raizQuadrada(int n, int i) 
            throws IllegalArgumentException {
        
        if( n <= 0 ){
            throw new IllegalArgumentException(" Exige n > 0 ");
        }
        double r = 1;
        while( 0 <= i ){
            r = (r + n/r) / 2;
            i = i - 1;
        }
        return r;
    }
}
