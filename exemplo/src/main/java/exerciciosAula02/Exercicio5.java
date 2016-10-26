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

public class Exercicio5 {

    /**
     * Método que nos diz se um número contém a propriedade 153.
     * @param n Número à descobrir se contém a propriedade ou não.
     * @return True se tiver a propriedade e False se não tiver.
     * @throws IllegalArgumentException
     */
    public static boolean propriedade153(int n) 
            throws IllegalArgumentException {
        
        if( n < 0 || n >= 9999 ){
            throw new IllegalArgumentException(" Exige 0 < n < 9999 ");
        }
        int i,j,k;
        i = n/100;
        j = (n - ( 100*i )) / 10;
        k = n % 10;
        boolean buliano;
        buliano = (i*i*i + j*j*j + k*k*k) == n;
        return buliano;
    }
    
}
