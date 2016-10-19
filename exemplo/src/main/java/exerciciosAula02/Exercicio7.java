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

public class Exercicio7 {
    public static void crivoEratostenes( int a[], int n ){
        if( n <= 1 ){
            throw new IllegalArgumentException(" Exige n > 1 ");
        }
        int i = 2;
        int c;
        if( i <= n && i <= 2 ){
            a[i] = 0;
        }
        while( i <= n/2 ){
            if( a[i] == 0 ){
              c = i + i;  
            
            while( c <= n){
                a[c] = 1;
                c = c + i;
            }
        }
            i = i + 1;
        }
    }
}
