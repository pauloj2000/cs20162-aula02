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

public class RazaoAurea {

    /**
     * Método que descobre a Razão Auréa, explicada abaixo:
     * A razão áurea pode ser obtida através da aplicação de um processo
     * iniciado com dois números inteiros positivos, por exemplo 1 e 2.
     * O número seguinte é obtido com a soma dos dois anteriores da sequência
     * Nesse exemplo, seria o 3, o seguinte 5, depois 8, depois 13 e assim
     * sucessivamente. Em algum momento optamos por interromper a geração da 
     * sequência e nesse ponto, obtemos a razão entre o último número da
     * sequência e o anterior. Essa é a razão auréa.
     *
     * @param x Inteiro que se deseja descobrir a razão áurea.
     * @param y Inteiro que se deseja descobrir a razão áurea.
     * @param k Indica a precisão do número desejado.
     * @return
     */
    public static float razaoAurea(int x, int y, int k) throws 
            IllegalArgumentException {
        
        if( x < 0 ){
            throw new IllegalArgumentException(" Exige x >= 0 ");
        }
        if( y < 0 ){
            throw new IllegalArgumentException(" Exige y >= 0 ");
        }
        if( x >= y ){
            throw new IllegalArgumentException(" Exige x < y ");
        }
        float c = y;
        float a = x;
        int i = 1;
        while( i <= k){
            float t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }
        return c / a;
    }
}
