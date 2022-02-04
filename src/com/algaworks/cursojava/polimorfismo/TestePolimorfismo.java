package com.algaworks.cursojava.polimorfismo;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        System.out.println();
        //-----------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        //-----------------------------------------
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    public static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$ " + conta.getSaldo());

        //Instanceof: informa o tipo de dado de uma variável
        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta; //cast do objeto
            System.out.println("O limite da conta corrente é R$ " + cc.getLimite());
        }
        if (conta instanceof ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta; //cast do objeto
            System.out.println("O limite da conta poupança é R$ " + cp.getRendimentos());
        }

    }
}
