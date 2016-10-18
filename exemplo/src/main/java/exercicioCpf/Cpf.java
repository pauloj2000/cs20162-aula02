/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioCpf;

/**
 *
 * @author paulo_000
 */
public class Cpf {
    
    private Cpf() {
        
    }

    public static final int TAMANHO_CPF = 11;

    public static final int TAMANHO_VETOR = 12;

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

    public static boolean cpfTipo3(final int[] d) {
        int tamanho = d.length;
        if (tamanho < TAMANHO_VETOR || tamanho > TAMANHO_VETOR) {
            throw new IllegalArgumentException(""
                    + "O CPF precisa de exatamente 11 dígitos.");
        }

        int c, p, s, j, k;
        c = 8;
        p = d[9];
        s = d[9];

        p += d[8];
        s += p;
        p += d[7];
        s += p;
        p += d[6];
        s += p;
        p += d[5];
        s += p;
        p += d[4];
        s += p;
        p += d[3];
        s += p;
        p += d[2];
        s += p;
        p += d[1];
        s += p;

        j = (s % 11) % 10;
        k = ((s - p + 9 * j) % 11) % 10;

        return j == d[10] && k == d[11];
    }
}
