/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula02;

/**
 *
 * @author aluno
 */
public class Exercicio4 {
    public static boolean propriedade3025(int n){
        if( n < 0 || n >= 9999 ){
            throw new IllegalArgumentException(" Exige 0 < n < 9999 ");
        }
        int i,j,k;
        i = n/100;
        j = n%100;
        k = i+j;
        return k*k == n;
    }
}
