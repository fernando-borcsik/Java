package dio.desafioBanco;

public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    protected String tipo;

    public Conta(Banco banco, Cliente cliente, String tipo) {
        this.numero = this.banco.getSEQUENCIAL();
        this.agencia = Conta.AGENCIA_PADRAO;
        this.cliente = cliente;
        this.banco = banco;
        this.saldo = 0;
        this.tipo = tipo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacando... \n Operação realizada com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Sacando... \n Saldo Insuficiente.");
        }

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Processando... \n Depósito realizado com sucesso! Saldo atual: " + saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        double taxa = 0;
        if(this.getBanco().getNome() != contaDestino.getBanco().getNome()) {
            taxa = this.getBanco().getTaxaInterbancaria();
            System.out.println("Transferência entre bancos diferentes. Taxa de transação: " + taxa);
        }

        if (valor + taxa <= this.saldo) {
            this.saldo -= (valor + taxa);
            contaDestino.saldo += valor;
            System.out.println("Processando... \n Transferência realizada com sucesso para " + contaDestino.getCliente().getNome()+
                    ". Saldo atual: " + this.saldo);
        } else {
            System.out.println("Processando... \n Saldo insuficiente.");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
