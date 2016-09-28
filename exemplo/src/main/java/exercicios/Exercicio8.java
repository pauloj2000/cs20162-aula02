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
public class Exercicio8 {
    public static int numeroHarmonico(int n){
        if( n <= 1 ){
            throw new IllegalArgumentException(" Exige n > 1 ");
        }
        int i = 2;
        int s = 1;
        while( i < n ){
            s = s + 1/i;
            i = i + 1;
        }
    return s;        
    }
}
