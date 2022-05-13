package dio.collections;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Criar lista e adicionar valores.");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(4.5);
        notas.add(6.5);
        notas.add(7.7);
        notas.add(0.6);
        notas.add(10.0);
        notas.add(5.0);

        System.out.println(notas.toString());

        System.out.println("Posição do valor 7.7: " + notas.indexOf(7.7));

        System.out.println("Adicionar valor 8.4 na posição 3: ");
        notas.add(3,8.4);
        System.out.println(notas);

        System.out.println("Substituindo valores: ");
        notas.set(notas.indexOf(10.0), 9.2);
        System.out.println(notas);

        System.out.println("Conferir elemento 9.2 na lista: " + notas.contains(9.2));

        System.out.println("Exibir elementos na ordem informada: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exibir o terceiro elemento da lista: " + notas.get(2));

        System.out.println("Exibindo a menor nota: " + Collections.min(notas));

        System.out.println("Exibindo a maior nota: " + Collections.max(notas));

        System.out.println("Soma dos valores da lista: ");
        Iterator<Double> iterator =  notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Média dos valores: " + (soma/notas.size()));

        System.out.println("Remover valor 0.6: ");
        notas.remove(0.6);
        System.out.println(notas);

        System.out.println("Remover notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando a lista toda.");
        notas.clear();
        System.out.println(notas);

        System.out.println("Verificando se está vazia: " + notas.isEmpty());

    }
}
