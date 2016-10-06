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
     
    private int fevereiroBissexto;
    
    private final int janeiro = 1;
    
    private final int fevereiro = 2;
    
    private final int março = 3;
    
    private final int abril = 4;
    
    private final int maio = 5;
    
    private final int junho = 6;
    
    private final int julho = 7;
    
    private final int agosto = 8;
    
    private final int setembro = 9;
    
    private final int outubro = 10;
    
    private final int novembro = 11;
    
    private final int dezembro = 12;
    
    private int anoParaComparar;
    
    public int entradaData(
            int dataConhecida, int anoBissexto, int dataDesejada, int diaDaSemana ){
               
        if( dataConhecida < 10000000 || dataConhecida > 99999999 ){
            return -1;
        }
        int anoConhecido = dataConhecida/10000;
        int mesConhecido = (dataConhecida%10000) / 100;
        int diaConhecido = (dataConhecida%10000) % 100;
        int anoDesejado = dataDesejada / 10000;
        int mesDesejado = (dataDesejada % 10000) / 100;
        int diaDesejado = (dataDesejada % 10000) % 100;
        anoParaComparar = anoBissexto;
        descobrirBissextos(anoConhecido);
        if( diaConhecido > 31 ){
            return -1;
        }
        if( mesConhecido == abril || mesConhecido == junho || 
            mesConhecido == setembro || mesConhecido == novembro
            && diaConhecido > 30 ){
            return -1;
        }
        if( mesConhecido == fevereiro && diaConhecido > fevereiroBissexto ){
            return -1;
        }
        if( diaConhecido <= 0){
            return -1;
        }
        
        if( diaDesejado > 31 ){
            return -1;
        }
        if( mesDesejado == abril || mesDesejado == junho || 
            mesDesejado == setembro || mesDesejado == novembro
            && diaDesejado > 30 ){
            return -1;
        }
        if( mesDesejado == fevereiro && diaDesejado > fevereiroBissexto ){
            return -1;
        }
        if( diaDesejado <= 0){
            return -1;
        }
        
        if( diaDaSemana < 0 || diaDaSemana > 6){
            return -1;
        } 
        int qtdDiasDoMes = 0;
        if (dataConhecida < dataDesejada) { //executado quando a data desejada é superior
            while (anoConhecido != anoDesejado || mesConhecido != mesDesejado
                   || diaConhecido != diaDesejado) {
                descobrirBissextos(anoConhecido);
                if(mesDesejado == janeiro || mesDesejado == março ||
                    mesDesejado == maio || mesDesejado == julho ||
                    mesDesejado == agosto || mesDesejado == outubro ||
                    mesDesejado == dezembro){
                    qtdDiasDoMes = 31;
                } else if (mesDesejado == abril || mesDesejado == junho  || 
                        mesDesejado == setembro || mesDesejado == novembro) {
                    qtdDiasDoMes = 30;
                } else if (mesDesejado == 2) {
                    qtdDiasDoMes = fevereiroBissexto;
                }

                diaDaSemana++;
                if (diaDaSemana > 6) {
                    diaDaSemana = 0;
                }

                diaConhecido++;
                if (diaConhecido > qtdDiasDoMes) {
                    diaConhecido = 1;
                    mesConhecido++;
                }

                if (mesConhecido > 12) {
                    mesConhecido = 1;
                    anoConhecido++;
                }
            }    
        return diaDaSemana;
        } else {
        while (anoConhecido != anoDesejado || mesConhecido != mesDesejado
            || diaConhecido != diaDesejado) {
                    
            if (diaConhecido < 1) {
                mesConhecido--;
            }
                
            if (mesConhecido < 1) {
                mesConhecido = 12;
                anoConhecido--;
            }
            descobrirBissextos(anoConhecido);
            if( mesDesejado == janeiro || mesDesejado == março ||
                mesDesejado == maio || mesDesejado == julho ||
                mesDesejado == agosto || mesDesejado == outubro ||
                mesDesejado == dezembro){
                qtdDiasDoMes = 31;
            } else if (mesDesejado == abril || mesDesejado == junho  || 
                mesDesejado == setembro || mesDesejado == novembro) {
                qtdDiasDoMes = 30;
            } else if (mesDesejado == 2) {
                    qtdDiasDoMes = fevereiroBissexto;
            }

            diaDaSemana--;
            if (diaDaSemana == -1) {
                diaDaSemana = 6;
            }
                
            if (diaConhecido < 1) {
               diaConhecido = qtdDiasDoMes;
            }
        }
        return diaDaSemana;
        }
    }
    
    
    /**
     * @param ano
     * Este método descobre o anoConhecido bissexto a partir do anoConhecido inserido pelo usuário
     */
    public void descobrirBissextos( int ano ){
        int restoAno;
        if (anoParaComparar > ano){
            restoAno = anoParaComparar - ano;
        } else {
            restoAno = ano - anoParaComparar;
        }
        
        if( restoAno % 4 == ano % 4){
            fevereiroBissexto = 29;
        } else {
            fevereiroBissexto = 28;
        }      
    }
}
