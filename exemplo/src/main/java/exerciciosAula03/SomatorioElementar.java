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
public class SomatorioElementar {
    public static int somaNaturais(int n){
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        int i = 1;
        int s = 0;
        int d;
        while( i <= n ){
            d = (i*i) + 1;
            s = s + 1/d;
            i = i + i;
        }
        return s;
    }
}
