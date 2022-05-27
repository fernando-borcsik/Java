package dio.desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Banco santodre = new Banco("SANTODRE");
        Banco drabesco = new Banco("DRABESCO");
        Banco tiau = new Banco("TIAU");

        List<Banco> bancos = new ArrayList<Banco>();
        bancos.add(santodre);
        bancos.add(drabesco);
        bancos.add(tiau);

        Cliente fernandoS = santodre.novoCliente("Fernando");
        ContaCorrente fernandoScc = (ContaCorrente) santodre.abrirContaCorrente(fernandoS);
        ContaPoupanca fernandoSpp = (ContaPoupanca) santodre.abrirContaPoupanca(fernandoS);

        Cliente AnaT = tiau.novoCliente("Ana");
        ContaCorrente AnaTcc = (ContaCorrente) tiau.abrirContaCorrente(AnaT);

        fernandoScc.depositar(100);

        fernandoScc.transferir(101,fernandoSpp);

        AnaTcc.depositar(300);

        AnaTcc.transferir(200,fernandoScc);

        fernandoScc.imprimirExtrato();
        fernandoSpp.imprimirExtrato();
        AnaTcc.imprimirExtrato();

        for (Banco banco : bancos)
            for (int i = 0; i < banco.getContas().size(); i++) {
                Conta conta = banco.getContas().get(i);
                System.out.println("Correntista: " + conta.getCliente().getNome() + ", Banco: " + banco.getNome() +
                        ", conta do tipo: " + conta.getTipo() + ", Saldo: " + banco.getContas().get(i).getSaldo());
            }

    }

}
