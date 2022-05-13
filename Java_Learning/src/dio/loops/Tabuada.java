package dio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite o número que deseja calcular a tabuada: ");
        Scanner scan = new Scanner(System.in);
        int fator = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(fator + " X " + i + " = " + (fator * i));
        }
    }
}
