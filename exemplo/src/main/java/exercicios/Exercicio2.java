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
public class Exercicio2 {
    public static int produtoUsandoSoma(int a, int b){
        
        int totalParcelas,parcela,i,s;
        
        totalParcelas = a;
        parcela = b;
        if (b <  a){
            totalParcelas = b;
            parcela = a;
        }
        i = 1;
        s = 0;
        while( i < totalParcelas){
            s = s + parcela;
            i++;
        }
    return s;    
    }
    
}
        
   
    