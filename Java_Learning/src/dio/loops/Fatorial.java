package dio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Digite um valor inteiro de x para calcular x! :");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double fatorial = 1;

        for (int i = 0; i < x; i++) fatorial *= (x - i);

        System.out.println(x + "! é igual a " + fatorial);
    }
}
