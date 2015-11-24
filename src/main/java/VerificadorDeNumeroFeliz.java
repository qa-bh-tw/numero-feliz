import static java.lang.Math.pow;

public class VerificadorDeNumeroFeliz {


    public boolean verificaNumeroFeliz(int numero) {

        double quadrado = pow(numero, 2);

        double somaValores = somaValores(quadrado);

        if (somaValores == 1) {
            return true;
        }
        else {
            double somaValoresSegundaIteracao = somaValores(somaValores);
            if (somaValoresSegundaIteracao == 1) {
                return true;
            }
        }
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
