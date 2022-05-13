package dio.arrays;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[20];

        for(int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for(int numero : numeros) System.out.println(numero + " ");

        System.out.println("Seus sucessores: ");
        for(int numero : numeros) System.out.println((numero + 1) + " ");


    }
}
