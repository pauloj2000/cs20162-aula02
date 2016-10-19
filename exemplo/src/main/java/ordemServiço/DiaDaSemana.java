/*
 * UNIVERSIDADE FEDERAL DE GOIÁS - UFG 
 * Construção de Software - 2016/2
 * Professor: Fábio Nogueira de Lucena
 */

package ordemServiço;

/**
 *  // Ordem de serviço - baseado em 'necessidade do cliente' // 
 * Implementação de um método para identificação do dia da semana de uma data
 * a partir de outra data considerando várias restrições.
 * 
 * @author Paulo Junio Sales Rodrigues
 */

public final class DiaDaSemana {
    
    /**
     * Evita que instância seja criada desnecessariamente.
     */
    private DiaDaSemana() {
    }

    /**
     * Valor relativo da casa das centenas no sistema decimal.
     */
    public static final int CENTENA = 100;

    /**
     * Valor relativo da casa das dezenas de milhares no sistema decimal.
     */
    public static final int DEZENA_DE_MILHAR = 10000;

    /**
     * Primeiro ano suportado pela classe Calendario.
     */
    public static final int PRIMEIRO_ANO_SUPORTADO = 1000;

    /**
     * Ultimo ano suportado pela classe Calendario.
     */
    public static final int ULTIMO_ANO_SUPORTADO = 9999;

    /**
     * Ultimo valor correspondente à um dia da semana.
     */
    public static final int ULTIMO_DIA_SEMANA = 6;

    /**
     * Número de dias em uma semana.
     */
    public static final int DIAS_NA_SEMANA = 7;

    /**
     * Número de meses em um ano.
     */
    public static final int MESES_NO_ANO = 12;

    /**
     * Número de dias no mês de Janeiro.
     */
    public static final int JANEIRO = 31;

    /**
     * Número de dias no mês de Fevereiro.
     */
    public static final int FEVEREIRO = 28;

    /**
     * Número de dias no mês de Fevereiro em anos bissextos.
     */
    public static final int FEVEREIRO_BISSEXTO = 29;

    /**
     * Número de dias no mês de Março.
     */
    public static final int MARCO = 31;

    /**
     * Número de dias no mês de Abril.
     */
    public static final int ABRIL = 30;

    /**
     * Número de dias no mês de Maio.
     */
    public static final int MAIO = 31;

    /**
     * Número de dias no mês de Junho.
     */
    public static final int JUNHO = 30;

    /**
     * Número de dias no mês de Julho.
     */
    public static final int JULHO = 31;

    /**
     * Número de dias no mês de Agosto.
     */
    public static final int AGOSTO = 31;

    /**
     * Número de dias no mês de Setembro.
     */
    public static final int SETEMBRO = 30;

    /**
     * Número de dias no mês de Outubro.
     */
    public static final int OUTUBRO = 31;

    /**
     * Número de dias no mês de Novembro.
     */
    public static final int NOVEMBRO = 30;

    /**
     * Número de dias no mês de Dezembro.
     */
    public static final int DEZEMBRO = 31;

    /**
     * Valor correspondente ao mês virtual que garante ao trabalhador brasileiro
     * uma gratificação de natal.
     */
    public static final int DECIMO_TERCEIRO = 13;

    /**
     * Calcula o dia da semana de uma data baseando se em outra data com o dia
     * da semana conhecido, e usando um ano bissexto como referencia para
     * caminhar "corretamente" pelo calendário.
     * @param data1 A data cujo dia da semana se deseja conhecer.
     * @param bissexto Um ano bissexto para referência.
     * @param data2 Uma data cujo dia da semana é conhecido.
     * @param diaConhecido O dia da semana da data usada como referência.
     * @return O dia da semana aonde 0 é segunda, 1 é terça, 2 é quarta,
     * 3 é quinta, 4 é sexta, 5 é sábado e 6 é domingo.
     * porém retorna -1 quando um dos parâmetros é inválido.
     */
    public static int diaDaSemana(final int data1, final int bissexto,
            final int data2, final int diaConhecido) {
        int dia1, mes1, ano1;

        dia1 = data1 % CENTENA;
        mes1 = data1 / CENTENA % CENTENA;
        ano1 = data1 / DEZENA_DE_MILHAR;

        if (ano1 < PRIMEIRO_ANO_SUPORTADO || ano1 > ULTIMO_ANO_SUPORTADO) {
            return -1;
        }

        if (!validaDataFator(dia1, mes1, ano1, 0)) {
            return -1;
        }

        int dia2, mes2, ano2;

        dia2 = data2 % CENTENA;
        mes2 = data2 / CENTENA % CENTENA;
        ano2 = data2 / DEZENA_DE_MILHAR;

        if (ano2 < PRIMEIRO_ANO_SUPORTADO || ano2 > ULTIMO_ANO_SUPORTADO) {
            return -1;
        }

        if (!validaDataFator(dia2, mes2, ano2, 0)) {
            return -1;
        }

        if (diaConhecido < 0 || diaConhecido > ULTIMO_DIA_SEMANA) {
            return -1;
        }

        if (bissexto <= 0) {
            return -1;
        }

        int fatorBissexto = bissexto % 4;
        int diaSemana = diaConhecido;

        if (data1 > data2) {
            while (!(dia2 == dia1 && mes2 == mes1 && ano2 == ano1)) {

                dia2++;
                if (!validaDataFator(dia2, mes2, ano2, fatorBissexto)) {
                    dia2 = 1;
                    mes2++;
                    if (mes2 == DECIMO_TERCEIRO) {
                        mes2 = 1;
                        ano2++;
                    }
                }

                diaSemana = (diaSemana + 1) % DIAS_NA_SEMANA;
            }
        } else {
            if (data1 < data2) {
                while (!(dia2 == dia1 && mes2 == mes1 && ano2 == ano1)) {

                    dia1++;
                    if (!validaDataFator(dia1, mes1, ano1, fatorBissexto)) {
                        dia1 = 1;
                        mes1++;
                        if (mes1 == DECIMO_TERCEIRO) {
                            mes1 = 1;
                            ano1++;
                        }
                    }

                    diaSemana--;
                    if (diaSemana == -1) {
                        diaSemana = ULTIMO_DIA_SEMANA;
                    }
                }
            }
        }

        return diaSemana;
    }

    /**
     * Valida uma data do Calendário Gregoriano usando um fator para julgar se
     * um ano é bissexto.
     * @param dia O dia da data.
     * @param mes O mês da data.
     * @param ano O ano da data.
     * @param f O fator usado para julgar se o ano é bissexto.
     * Um ano é bissexto se o resto da divisão por 4 for igual ao fator mas o
     * resto da divisão por 100 for diferente do fator, ou se o resto da divisão
     * por 400 for igual ao fator. Ou seja, na nossa sociedade o fator correto
     * seria zero.
     * @return Se a data é válida segundo as prescrições.
     */
     public static boolean validaDataFator(final int dia, final int mes,
            final int ano, final int f) {
        if (mes < 1 || mes > MESES_NO_ANO) {
            return false;
        }

        int[] diasNoMes = {0, JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO,
            JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO};
        boolean bissexto;
        bissexto = ano % 4 == f && ano % 100 != f || ano % 400 == f;
        if (bissexto) {
            diasNoMes[2] = FEVEREIRO_BISSEXTO;
        }

        return !(dia < 1 || dia > diasNoMes[mes]);
    }
}