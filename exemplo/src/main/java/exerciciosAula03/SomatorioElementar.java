/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exerciciosAula03;

/**
 * Implementação dos algorítmos listados para as aulas 01 e 02
 * disponibilizados em sala de aula.
 * Soluções matemáticas para diversos cálculos diferentes
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public class SomatorioElementar {

    /**
     * Metodo que soma os n primeiro numeros naturais
     *
     * @param n - int - numero dos n primeiros numeros a serem somados
     * @return s - valor da soma
     * @throws IllegalArgumentException
     */
    public static float somaNaturais(int n) throws IllegalArgumentException {
        
        float d;
        int i;
        float s;

        if (n < 1) {
            throw new IllegalArgumentException(" Exige n >= 1. ");
        }

        s = 0;

        for (i = 0; i <= n; i++) {
            d = (float) (1 + Math.pow(i, 2));
            s += 1 / d;
        }

        return  s;
    }
}