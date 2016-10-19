/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package exercicioCpf;

/**
 * Implementação de um algorítmo que verifica o CPF(Cadastro de Pessoas Físicas)
 * Se a regra de formação dos dígitos verificados é atendida, retorna verdadeiro
 * caso contrário, retorna falso.
 * 
 * @author Paulo Junio Sales Rodrigues 
 */
public class Cpf {
    
    /**
     * Evita que instância seja criada desnecessariamente.
     */
    private Cpf() {     
    }

    /**
     * Atributo para definir o tamanho do CPF.
     */
    public static final int TAMANHO_CPF = 11;
    
    /**
     * Atributo para definir o tamanho do vetora ser trabalhado.
     */
    public static final int TAMANHO_VETOR = 12;

    /**
     * Primeiro método de verificação de CPF.
     * @param d Dígitos de entrada para formar o CPF através de um vetor.
     * @return True para um CPF válido e False para um inválido.
     */
    public static boolean cpfTipo1(final int[] d) {
        int tamanho = d.length;
        if (tamanho < TAMANHO_CPF || tamanho > TAMANHO_CPF) {
            throw new IllegalArgumentException(
                    "O CPF precisa de exatamente 11 dígitos.");
        }

        int sj, sk, j, k;
        sj = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5]
                + 7 * d[6] + 8 * d[7] + 9 * d[8];
        sk = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6]
                + 7 * d[7] + 8 * d[8] + 9 * d[9];
        j = (sj % 11) % 10;
        k = (sk % 11) % 10;

        return j == d[9] && k == d[10];
    }
    
    /**
     * Segundo método de verificação de CPF.
     * @param d Dígitos de entrada para formar o CPF através de um vetor.
     * @return True para um CPF válido e False para um inválido.
     */
    public static boolean cpfTipo2(final int[] d) {
        int tamanho = d.length;
        if (tamanho < TAMANHO_VETOR || tamanho > TAMANHO_VETOR) {
            throw new IllegalArgumentException(
                    "O CPF precisa de exatamente 11 dígitos.");
        }

        int c, p, s, j, k;
        c = 8;
        p = d[9];
        s = d[9];
        while (c >= 1) {
            p += d[c];
            s += p;
            c--;
        }

        j = (s % 11) % 10;
        k = ((s - p + 9 * j) % 11) % 10;

        return j == d[10] && k == d[11];
    }
}
