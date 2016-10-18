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
    public static int calcularPi(int n){
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        int i = 1;
        int s = -1;
        int d = -1;
        int p = 0;
        while( i <= n ){
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }
        return p;
    }
}
