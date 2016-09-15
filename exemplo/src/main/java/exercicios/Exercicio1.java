/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int i = 1,s = 2,n;
        
        System.out.println(" Digite o valor de N ");
        Scanner ler = new Scanner(System.in);
        n = Integer.parseInt(ler.nextLine());
        while(i<n){
            s = s + i;
            i = i + i;
        }
        System.out.println(" A soma dos naturais até " + n + " é : " + s );
    }
    
}
