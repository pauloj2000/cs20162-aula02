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
public class RaizQuadrada {
    public static double raizQuadrada(int n, int i){
        if( n <= 0 ){
            throw new IllegalArgumentException(" Exige n > 0 ");
        }
        double r = 1;
        while( 0 <= i ){
            r = (r + n/r) / 2;
            i = i - 1;
        }
        return r;
    }
}
