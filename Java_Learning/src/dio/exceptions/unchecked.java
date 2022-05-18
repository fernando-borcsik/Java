package dio.exceptions;

import javax.swing.*;

public class unchecked {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada inválida. Informe um número inteiro! " + e.getMessage());
//            e.printStackTrace();
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "O numerador não pode ser zero! " + e.getMessage());
            }

        } while(continueLooping);

    }

    public static int dividir(int a, int b) {return a / b; }
}
