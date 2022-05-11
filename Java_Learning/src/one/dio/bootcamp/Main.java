package one.dio.bootcamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(12,7.8);
        Calculadora.subtracao(7.9,4.67);
        Calculadora.multiplicacao(8.89,4.12);
        Calculadora.divisao(7.89,23.5);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(20);

        // Parcela
        System.out.println("Exercício Parcelas");
        Calculo_Parcela.Valor_Parcela(10000,1);
    }

}
