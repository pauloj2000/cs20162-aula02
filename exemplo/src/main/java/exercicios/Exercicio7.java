/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author paulo_000
 */
public class Exercicio7 {
    public static void crivoEratostenes( int a[], int n ){
        int i = 2;
        int c;
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
