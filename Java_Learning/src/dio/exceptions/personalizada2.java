package dio.exceptions;

public class personalizada2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);

            System.out.println("O programa continua...");
        }
    }
}
