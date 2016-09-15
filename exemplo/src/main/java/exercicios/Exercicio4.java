/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author aluno
 */
public class Exercicio4 {
    public static boolean propriedade3025(int n){
        int i,j,k;
        i = n/100;
        j = n%100;
        k = i+j;
        return k*k == n;
    }
}
