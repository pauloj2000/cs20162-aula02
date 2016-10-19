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

public class Fibonacci {
    public static int calcularFibonacci(int n){
        if( n < 0 ){
            throw new IllegalArgumentException(" Exige n >= 0" );
        }
        int a = 0;
        int c = 1;
        if( n == 0 || n == 1 ){
            return n;
        } 
        int i = 2;
        while( i <= n ){
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c;
    }
}
