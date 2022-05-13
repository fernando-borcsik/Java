package dio.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] vogais = {"a", "e", "i", "o", "u"};
        String[] consoantes = new String[6];

        int numConsoantes = 0;
        int i =0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            System.out.println(Arrays.binarySearch(vogais,letra.toLowerCase()));
            if (Arrays.binarySearch(vogais,letra.toLowerCase()) < 0) {
                consoantes[i] = letra;
                numConsoantes++;
            }

            i++;
        } while (i<consoantes.length);
        System.out.println("Foram digitadas " + numConsoantes + " consoantes! Consoantes digitadas: ");

        for (String consoante : consoantes) {
            if (consoante != null ) System.out.println(consoante);
        }


    }
}
