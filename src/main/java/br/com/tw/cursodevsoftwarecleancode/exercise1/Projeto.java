package br.com.tw.cursodevsoftwarecleancode.exercise1;

import java.time.ZonedDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

public class Projeto {

    private static final long MAXIMO_DE_DIAS_PARA_SER_PROJETO_TRANQUILO = 90;

    private final ZonedDateTime dataFinal;

    public Projeto(ZonedDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String status() {
        String prefixoDaMensagem = "Resultado do projeto: ";

        if (estaApertado()) {
            return prefixoDaMensagem + "O projeto está apertado.";
        }

        return prefixoDaMensagem + "O projeto está tranquilo. (isso nunca vai acontecer :D)";
    }

    private boolean estaApertado() {
        return calculaDiasRestantesParaFimDoProjeto() < MAXIMO_DE_DIAS_PARA_SER_PROJETO_TRANQUILO
                && !foiEntregue();
    }

    private boolean foiEntregue() {
        return dataFinal.isBefore(ZonedDateTime.now());
    }

    private long calculaDiasRestantesParaFimDoProjeto() {
        return DAYS.between(ZonedDateTime.now(), dataFinal);
    }

}
