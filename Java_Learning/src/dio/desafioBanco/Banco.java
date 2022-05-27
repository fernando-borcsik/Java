package dio.desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static int SEQUENCIAL = 1;
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    private static double taxaInterbancaria = 10;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static double getTaxaInterbancaria() {
        return taxaInterbancaria;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Cliente novoCliente(String nomeCliente) {
        String banco= nome;
        Cliente cliente = new Cliente(banco, nomeCliente);
        return cliente;
    }

    public Conta abrirContaCorrente(Cliente cliente) {
        String banco = nome;
        ContaCorrente cc = new ContaCorrente(this, cliente, "CORRENTE");
        this.contas.add(cc);
        SEQUENCIAL++;
        return cc;
    }

    public Conta abrirContaPoupanca(Cliente cliente) {
        String banco = nome;
        ContaPoupanca pp = new ContaPoupanca(this, cliente, "POUPANCA");
        this.contas.add(pp);
        SEQUENCIAL++;
        return pp;
    }

}
