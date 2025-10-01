package br.com.Ex_30Set_2;

public class Tubarao extends Animal{

    private String especie;



    public Tubarao(String nome, int idade, String especie) {
        super(nome, idade);
        this.especie = especie;
    }


    @Override
    public void emitirSom() {
        System.out.println(nome + " : Bate os Dentes!");
    }


    @Override
    public void mover() {
        System.out.println(nome + " está Nadando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Espécie: " + especie);
    }

    public void perseguirPresa(){
        System.out.println(nome + "Está Perseguindo sua Presa");
    }
}
