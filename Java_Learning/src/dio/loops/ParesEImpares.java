package dio.loops;

import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        System.out.println("Quantos números serão digitados? ");
        Scanner scan = new Scanner(System.in);
        int quantNum = 0;
        quantNum = scan.nextInt();
        System.out.println("Ok, agora digite-os!");
        int numero;
        int numPares = 0;
        int numImpares = 0;
        int i = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) numPares++;
            else numImpares++;

            i++;
        } while (i < quantNum);

        System.out.println("Foram digitados " + numPares + " números pares e " + numImpares + " números ímpares.");
    }
}
