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

public class Exercicio8 {
    public static int numeroHarmonico(int n){
        if( n <= 1 ){
            throw new IllegalArgumentException(" Exige n > 1 ");
        }
        int i = 2;
        int s = 1;
        while( i < n ){
            s = s + 1/i;
            i = i + 1;
        }
    return s;        
    }
}
