package br.com.Ex_30Set;

public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano,int peso,
                 int numeroPortas, boolean arCondicionado) {
        super(marca, modelo, ano, peso);
        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + numeroPortas);
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto!");
    }
}