package dio.loops;

import java.util.Scanner;

public class Maior_e_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Número:");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma += numero;
            count += 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma / 5);
    }
}
