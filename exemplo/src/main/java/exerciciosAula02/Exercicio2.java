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

public class Exercicio2 {
    public static int produtoUsandoSoma(int a, int b){
        if( a < 0 ){
            throw new IllegalArgumentException(" Exige a >= 0 ");
        }
        
        if( b < 0 ){
            throw new IllegalArgumentException(" Exige b >= 0 ");
        }
        
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
        
   