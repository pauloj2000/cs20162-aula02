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
public class Exercicio3 {
    public static int potenciaUsandoSoma(int x, int y){
        if(x < 0){
            throw new IllegalArgumentException(" x deve ser maior igual a 0 ");
        }
        if(y < 0){
            throw new IllegalArgumentException(" y deve ser maior igual a 0 ");
        }
        
       int i,potencia;
       potencia = 1;
       i = 1;
       while(i <= y){
           potencia = potencia * x;
           i++;
       }
    return potencia;    
    }
}
    