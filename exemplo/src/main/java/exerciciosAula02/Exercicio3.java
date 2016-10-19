/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula02;

/**
 * Implementação dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
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
    