package dio.desafioBanco;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Banco banco, Cliente cliente, String tipo) {
        super(banco, cliente, tipo);
    }


    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }

}
