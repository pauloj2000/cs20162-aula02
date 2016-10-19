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

public class Fatorial {
    public static int calcularFatorial(int n){
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        int i = 2;
        int f = 1;
        while( i <= n){
            f = f * i;
            i = i + 1;
        }
        return f;
    }
}
