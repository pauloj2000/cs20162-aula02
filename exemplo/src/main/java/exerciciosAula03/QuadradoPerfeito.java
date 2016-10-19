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

public class QuadradoPerfeito {

    /**
     * Método que descobre se o número é quadrado perfeito.
     * @param k Inteiro que se deseja descobrir se contém a propriedade.
     * @return True se for quadrado perfeito e False se não for.
     */
    public static boolean quadradoPerfeito(int k) 
            throws IllegalArgumentException {
        if( k < 1 ){
            throw new IllegalArgumentException(" Exige k >= 1 ");
        }
        int i = 1;
        int q = 1;
        while( q < k ){
            i = i + 2;
            q = q + i;
        }
        return q == k;
    }
}
