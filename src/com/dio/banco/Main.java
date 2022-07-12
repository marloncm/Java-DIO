package com.dio.banco;

public class Main {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Marlon");

        Conta cc = new ContaCorrente(cli);
        Conta poupanca = new ContaPoupanca(cli);

        cc.imprimirExtrato();
       // poupanca.imprimirExtrato();

        cc.depositar(100);
       // cc.imprimirExtrato();
        //poupanca.imprimirExtrato();

        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
     //  poupanca.mostraExtrato();
    }

}
