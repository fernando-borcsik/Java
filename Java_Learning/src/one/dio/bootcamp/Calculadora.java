package one.dio.bootcamp;

public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de "+numero1+" e "+numero2+" é "+resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtração entre "+numero1+" e "+numero2+" é "+resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("o produto de "+numero1+" e "+numero2+" é "+resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A razão entre "+numero1+" e "+numero2+" é "+resultado);
    }

}
