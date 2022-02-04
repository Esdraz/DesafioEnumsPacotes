package com.algaworks.cursojava.cafeteira;

public class MaquinaCafe {

    int acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(int quandidadeAcucar) {
        if (acucarDisponivel < quandidadeAcucar) {
            System.out.println("Não há açúcar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quandidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quandidadeAcucar + " gramas de açúcar.");
        }
    }


}
