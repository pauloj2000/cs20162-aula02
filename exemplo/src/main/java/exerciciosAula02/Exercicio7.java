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


public class Exercicio7 {

    /**
     * Método que utiliza o Crivo de Eratostenes
     * @param a Preenchimento do vetor.
     * @param n Número inteiro.
     * @return 
     * @throws IllegalArgumentException
     */
    public static int[] crivoEratostenes(int a[], int n) 
            throws IllegalArgumentException {
        if (n > 1) {

            for (int i = 2; i <= n; i++) {
                if (a[i] != 0) {
                    throw new IllegalArgumentException(" Vetor inválido ");
                }
            }
            for (int i = 2; i <= (n / 2); i++) {

                for (int c = (i + i); c <= n; c += i) {

                    a[c] = 1;

                }

            }

            return a;

        } else {
            throw new IllegalArgumentException(" Exige n > 1 ");
        }

    }

}

