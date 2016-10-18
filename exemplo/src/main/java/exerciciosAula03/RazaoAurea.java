/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosAula03;

/**
 *
 * @author paulo_000
 */
public class RazaoAurea {
    public static float razaoAurea(int x, int y, int k){
        if( x < 0 ){
            throw new IllegalArgumentException(" Exige x >= 0 ");
        }
        if( k < 0 ){
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
