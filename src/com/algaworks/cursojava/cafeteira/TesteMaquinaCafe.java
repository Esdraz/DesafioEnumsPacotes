package com.algaworks.cursojava.cafeteira;

public class TesteMaquinaCafe {

    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.acucarDisponivel = 30;

        maquina.fazerCafe(10);
        maquina.fazerCafe(15);

        maquina.fazerCafe();
    }
}
