/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemServiço;

/**
 *
 * @author alunoinf
 */
public class DiaDaSemana {
     
    private int fevereiro;
    
    private int anoParaComparar;
    
    public static int entradaData(
            int data, int anoBissexto, int segundaData, int diaDaSemana ){
        if( data < 10000000 || data > 99999999 ){
            return -1;
        }
        int ano = this.data/10000;
        int mes = (this.data%10000) / 100;
        int dia = (this.data%10000) % 100;
        anoParaComparar = anoBissexto;
        descobrirBissextos(ano);
        if( mes == 01 || mes == 03 || mes == 05 || mes == 07 || mes == 08
                || mes == 10 || mes == 12 && dia > 31 ){
            return = -1;
        }
        if( mes == 04 || mes == 06 || mes == 09 || mes == 11
            && dia > 30 ){
            return = -1;
        }
        if( mes == 02 && dia > fevereiro ){
            return = -1;
        }
        if( dia <= 0){
            return = -1;
        }
        if( diaDaSemana < 0 || diaDaSemana > 6){
           return = -1;
        }
        
    }
    
    public static void descobrirBissextos( int ano ){
        int restoAno;
        if (anoParaComparar > this.ano){
            restoAno = anoParaComparar - this.ano;
        } else {
            restoAno = this.ano - anoParaComparar;
        }
        
        if( restoAno % 4 == this.ano % 4){
            fevereiro = 29;
        } else {
            fevereiro = 28;
        }
        
    }
}
