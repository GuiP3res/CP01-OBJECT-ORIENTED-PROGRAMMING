package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 10);

        v1.adicionargas(50.0);
        v1.gastargas(100.0);

        System.out.println("Dono: " + v1.getIndividuo() + " | Placa: " + v1.getPl() + " | Gás: " + v1.getGas());
    }
}