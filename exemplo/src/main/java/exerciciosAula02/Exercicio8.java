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

public class Exercicio8 {

    /**
     * Método que nos retorna o número harmônico.
     * @param n Inteiro que deseja descobrir qual o número harmônico.
     * @return Inteiro que representa o número harmônico para 'n'.
     * @throws IllegalArgumentException
     */
    public static float numeroHarmonico(int n)throws IllegalArgumentException {
        float i = 2;
        float s = 1;
        
        if(n < 1) {
            throw new IllegalArgumentException(
                    " Exige que o número seja maior que 0 ");
        }
        
        while(i <= n) {
            s = s + 1 / i;
            i = i + 1;
        }
        
        return s;
    }   
}