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

public class LogaritmoNatural {

    /**
     * Método que descobre o logarítmo natural entre dois números.
     * @param n Um dos números a ser feito o logarítmo natural.
     * @param k O outro número a ser feito o logarítmo natural.
     * @return Resultado do logarítmo natural.
     */
    public static double logNatural(double n, double k) 
            throws IllegalArgumentException {
        
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        if( k < 2){
            throw new IllegalArgumentException(" Exige k >= 2 ");
        }
        float i = 2;
        double e = n + 1;
        while( i <= k ){
            double p = (Math.pow(n , i));
            double f = Fatorial.calcularFatorial((int) n);
            e = e + p / f;
            i = i + 1;
        }
        return e;
    }
}
