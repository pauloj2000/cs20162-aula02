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
public class Fibonacci {
    public static int calcularFibonacci(int n){
        if( n < 0 ){
            throw new IllegalArgumentException(" Exige n >= 0" );
        }
        int a = 0;
        int c = 1;
        if( n == 0 || n == 1 ){
            return n;
        } 
        int i = 2;
        while( i <= n ){
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c;
    }
}
