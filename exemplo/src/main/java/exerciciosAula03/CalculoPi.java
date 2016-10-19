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

public class CalculoPi {
    public static double calcularPi(double n){
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        double i = 1;
        double s = -1;
        double d = -1;
        double p = 0;
        while( i <= n ){
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }
        return p;
    }
}
