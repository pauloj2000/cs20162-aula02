/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirosExercicios;

/**
 *
 * @author Alunoinf_2
 */
public class Exercicio6 {

    /**
     *
     * @param n
     * @return
     */
    public static boolean numeroPrimo( int n ){
        int i = 2;
        if( n <= 1 ){
            throw new IllegalArgumentException(" Exige n > 1 ");
        }
        while( i <= n-1 ){
            if( n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
