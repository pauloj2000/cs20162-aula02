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

public class RazaoAurea {
    public static float razaoAurea(int x, int y, int k){
        if( x < 0 ){
            throw new IllegalArgumentException(" Exige x >= 0 ");
        }
        if( k < 0 ){
            throw new IllegalArgumentException(" Exige y >= 0 ");
        }
        if( x >= y ){
            throw new IllegalArgumentException(" Exige x < y ");
        }
        float c = y;
        float a = x;
        int i = 1;
        while( i <= k){
            float t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    }
}
