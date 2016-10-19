/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula03;

/**
 *
 * @author paulo_000
 */
public class LogaritmoNatural {
    public static double logNatural(double n, double k){
        
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
