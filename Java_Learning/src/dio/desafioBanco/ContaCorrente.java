package dio.desafioBanco;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public ContaCorrente(Banco banco, Cliente cliente, String tipo) {
        super(banco, cliente, tipo);
        this.chequeEspecial = 200;
    }

    public void sacar(double valor) {
        if ((valor - chequeEspecial )<= saldo) {
            saldo -= valor;
            System.out.println("Sacando... \n Operação realizada com sucesso! Saldo atual: " + saldo);
            if (saldo < 0) System.out.println("Atenção! Você acaba de entrar no Cheque Especial.");
        } else {
            System.out.println("Sacando... \n Saldo Insuficiente.");
        }

    }

    public void transferir(double valor, Conta contaDestino) {

        double taxa = 0;
        if(this.getBanco().getNome() != contaDestino.getBanco().getNome()) {
            taxa = this.getBanco().getTaxaInterbancaria();
            System.out.println("Transferência entre bancos diferentes. Taxa de transação: " + taxa);
        };

        if ((valor + taxa - chequeEspecial) <= this.saldo) {
            this.saldo -= (valor + taxa);
            contaDestino.saldo += valor;
            System.out.println("Processando... \n Transferência realizada com sucesso para " + contaDestino.getCliente().getNome()+
                    ". Saldo atual: " + this.saldo);
            if (saldo < 0) System.out.println("Atenção! Você acaba de entrar no Cheque Especial.");
        } else {
            System.out.println("Processando... \n Saldo insuficiente.");
        }
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }



}
