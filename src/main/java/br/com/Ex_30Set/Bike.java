package br.com.Ex_30Set;

public class Bike extends Veiculo{
    private int numeroAro;
    private boolean freioADisco;

    public Bike(String marca, String modelo, int ano, int peso,
                 int numeroAro, boolean freioADisco) {
        super(marca, modelo, ano, peso);

        this.numeroAro = numeroAro;
        this.freioADisco = freioADisco;
}

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Aro: "+ numeroAro);
        System.out.println("Freio a Disco: " + (freioADisco ? "Sim" : "Não"));
    }

    public void derrapando() {
        System.out.println("Moto derrapando!");
    }
}
