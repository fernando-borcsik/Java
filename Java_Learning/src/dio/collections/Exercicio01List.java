package dio.collections;


/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temps = new ArrayList<Double>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int nMeses = 6;

        //Recebendo valores
        for(int i = 0; i < nMeses; i++){
            System.out.println("Digite a Temperatura média de " + meses[i] + ":");
            double temp = Double.parseDouble(scan.nextLine());
            temps.add(temp);
        }

        //Média
        double media = temps.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.println("Valores das temperaturas médias: ");
        temps.forEach(t -> System.out.println(t + "°C "));
        System.out.printf("\nMédia: %.1f°C\n", media);

        //Valores acima da média
        System.out.println("Temperaturas acima da média: ");
        temps.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f°C em " + meses[temps.indexOf(t)] + "\n", t));

    }
}
