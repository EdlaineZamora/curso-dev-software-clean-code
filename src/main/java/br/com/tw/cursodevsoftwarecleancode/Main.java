package br.com.tw.cursodevsoftwarecleancode;

import br.com.tw.cursodevsoftwarecleancode.exercise1.Projeto;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime dataFinal = ZonedDateTime.of(2020, 12, 31, 23, 59, 59, 0, ZoneId.systemDefault());

        Projeto projeto = new Projeto(dataFinal);

        System.out.println(projeto.status());
    }

}
