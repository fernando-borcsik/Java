package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {
        Gato Roach = new Gato("Roach","P&B",3);
        Gato Pedrita = new Gato("Pedrita", "Escamosa", 1);

        Livro livro = new Livro("Psiconautas",261);

        System.out.println(Roach);
        System.out.println(Pedrita);
        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello, World! " +(a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}