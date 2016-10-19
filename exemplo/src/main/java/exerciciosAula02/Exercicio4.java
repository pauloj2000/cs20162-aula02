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

public class Exercicio4 {
    public static boolean propriedade3025(int n){
        if( n < 0 || n >= 9999 ){
            throw new IllegalArgumentException(" Exige 0 < n < 9999 ");
        }
        int i,j,k;
        i = n/100;
        j = n%100;
        k = i+j;
        return k*k == n;
    }
}
