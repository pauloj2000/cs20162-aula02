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
    public static boolean quadradoPerfeito(int k){
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
