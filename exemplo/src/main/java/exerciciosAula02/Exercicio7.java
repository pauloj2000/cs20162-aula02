/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

/**
 *
 * @author paulo_000
 */
public class Exercicio7 {
    public static void crivoEratostenes( int a[], int n ){
        if( n <= 1 ){
            throw new IllegalArgumentException(" Exige n > 1 ");
        }
        int i = 2;
        int c;
        if( i <= n && i <= 2 ){
            a[i] = 0;
        }
        while( i <= n/2 ){
            if( a[i] == 0 ){
              c = i + i;  
            
            while( c <= n){
                a[c] = 1;
                c = c + i;
            }
        }
            i = i + 1;
        }
    }
}
