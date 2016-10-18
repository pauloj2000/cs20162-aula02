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
public class QuadradoPerfeito {
    public static boolean quadradoPerfeito(int k){
        if( k < 1 ){
            throw new IllegalArgumentException(" Exige k >= 1 ");
        }
        int i = 1;
        int q = 1;
        while( q < k ){
            i = i + 2;
            q = q + i;
        }
        return q == k;
    }
}
