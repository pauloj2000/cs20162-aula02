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
public class Fatorial {
    public static int calcularFatorial(int n){
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        int i = 2;
        int f = 1;
        while( i <= n){
            f = f * i;
            i = i + 1;
        }
        return f;
    }
}
