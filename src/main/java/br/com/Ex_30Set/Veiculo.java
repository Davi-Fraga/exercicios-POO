package br.com.Ex_30Set;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidade;
    protected int peso;

    public Veiculo(String marca, String modelo, int ano,int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.peso = peso;
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
        System.out.println(modelo + " acelerando para " + velocidade + " km/h");
    }

    public void frear(double decremento) {
        velocidade = Math.max(0, velocidade - decremento);
        System.out.println(modelo + " reduzindo para " + velocidade + " km/h");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Peso: " + peso + "Kg");
    }
}