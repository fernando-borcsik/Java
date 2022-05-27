package dio.orientacaoObjetos;

// Exercício de Classes. Classe Carro construída, com método que calcula o valor pago ao encher o tanque.


public class Carro {

    private String cor;
    private String modelo;
    private double capacidadeTanque;


    public Carro () {

    }
    public Carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double precoCombustivel) {
        return capacidadeTanque * precoCombustivel;
    }

}
