/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {
    public static int somaNaturais( int n ){
        int i = 1,s = 2;
        if( n < 1 ){
            throw new IllegalArgumentException(" Exige n >= 1 ");
        }
        while( i < n ){
            s = s + i;
            i = i + 1;
        }
        return s;
    }
    
}
