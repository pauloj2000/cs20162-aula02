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
public class Exercicio5 {
    public static boolean propriedade153(int n){
        int i,j,k;
        i = n/100;
        j = (n - 100*i) / 10;
        k = n % 10;
        return (i*3 + j*3 + k*3) == n;
    }
    
}
