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

    /**
     * Método que resulta no produto de dois números utilizando soma.
     * @param a Um dos inteiros para fazer o produto.
     * @param b O outro inteiro para fazer o produto.
     * @return Produto de a e b.
     */
    public static int produtoUsandoSoma(int a, int b) 
            throws IllegalArgumentException {
        
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
        
   