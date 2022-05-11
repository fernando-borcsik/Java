package one.dio.bootcamp;

public class Mensagem {

    public static void obterMensagem(int hora) {
        if (5<=hora && hora<=12) {
            mensagemBomDia();
        } else if (13<=hora && hora<=17) {
            mensagemBoatarde();
        } else if (18<=hora && hora<=23 || 0<=hora && hora<=4) {
            mensagemBoaNoite();
        } else {
            System.out.println("Hora inválida");
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoatarde() {
        System.out.println("Boa tarde!");
    }
    
    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }

}
