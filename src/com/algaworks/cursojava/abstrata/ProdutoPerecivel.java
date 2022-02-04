package com.algaworks.cursojava.abstrata;

public class ProdutoPerecivel extends Produto{

    String dataValidade; //usado até aprender a classe Date

    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}
