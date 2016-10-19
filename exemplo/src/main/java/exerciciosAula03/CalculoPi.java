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
