import java.util.LinkedHashSet;

import java.util.Set;

import static java.lang.Math.pow;

public class VerificadorDeNumeroFeliz {

    public boolean verificaNumeroFeliz(int numero) {
        double candidato = numero;
        double valorSomado = 0;
        Set<Integer> candidatos = new LinkedHashSet<Integer>();
        candidatos.add(numero);


        if (candidato < 10) {
            candidato = pow(numero, 2);
            candidatos.add((int) candidato);
        }


        do {
            valorSomado = somaValores(candidato);

            if (!candidatos.add((int) valorSomado) && (valorSomado != 1)) {
                return false;
            }

            candidato= valorSomado;

        } while ((valorSomado != 1) && (valorSomado != numero));



        if ((valorSomado == numero) && (valorSomado != 1)) {
            return ehInfeliz(valorSomado);

        }
        return true;
    }

    private boolean ehInfeliz(double somaValores) {
        /*
        A ideia seria criar uma lista dos valores calculados,
        caso se repetirem significa que o numero inicial nao eh feliz
         */

        return false;
    }

    private double somaValores(double quadrado) {
        Double d = new Double(quadrado);

        int valorArray[] = quebraNumero(d.intValue());

        double somaValores = 0;

        for (int i = 0; i < valorArray.length; i++) {
            somaValores = somaValores + pow(valorArray[i], 2);
        }
        return somaValores;
    }


    public int[] quebraNumero(int numero) {

        int[] resultado = new int[numero];

        String valorString = String.valueOf(numero);

        int i = valorString.length();

        for (int j = 0; j < i; j++) {
            resultado[j] = Integer.parseInt(valorString.substring(j, j + 1));
        }

        return resultado;
    }

}
