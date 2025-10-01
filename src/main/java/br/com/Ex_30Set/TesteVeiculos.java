package br.com.Ex_30Set;

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ferrari", "Spider", 2021, 1670, 2,true ),
                new Moto("Honda", "CG 160", 2021, 120, 160, true),
                new Carro("Lamborghini", "Aventador", 2022, 1575, 2,true),
                new Bike("Trek", "Verve 2", 2025, 23, 32, true)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            if (veiculo instanceof Bike) {
                veiculo.acelerar(60);
            } else if( veiculo instanceof Carro){
                veiculo.acelerar(200);
            }else {
                veiculo.acelerar(100);
            }

            System.out.println("---");
        }
    }
}
