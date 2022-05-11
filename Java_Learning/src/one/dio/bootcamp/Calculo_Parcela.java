package one.dio.bootcamp;

public class Calculo_Parcela {

    public static void Valor_Parcela(double total, double numParcelas){
        double juros = Math.log10(numParcelas);
        double percent = juros * 100;
        double newTotal = total * (1 + juros);
        double valorParcela = newTotal / numParcelas;
        System.out.println("O valor de " + total + " reais, pago em " + numParcelas + " parcelas, sofrerá juros de "
            + percent + "%, totalizando " + newTotal + " reais, ou " + valorParcela + " reais por parcela");
    }
}
