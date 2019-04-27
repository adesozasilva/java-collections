package br.com.adesozasilva.sets;

import java.util.Collection;

public class InsereEbuscaElementos {

    public static long executa(Collection<Integer> numeros ) {

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;
        
        return tempoDeExecucao;

    }

}