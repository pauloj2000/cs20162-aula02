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

public class Exercicio6 {

    /**
     * Método que retorna se um número é ou não é primo.
     * @param n O número que deseja descobrir.
     * @return True se for primo e False se não for.
     */
    public static boolean numeroPrimo(final int n) 
            throws IllegalArgumentException {
        
        if (n <= 1) {
            throw new IllegalArgumentException(" Exige n > 1. ");
        }

        int i = 2;
        while (i <= (n - 1)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
