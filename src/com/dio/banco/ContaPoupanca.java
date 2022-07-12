package com.dio.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
        if(getExtrato().isEmpty()){
            System.out.println("\nEssa conta nao possui movimentacoes");
            System.out.println("*******************************\n");
        }else{
            System.out.println("\n--- Historico de Movimentacoes ---\n");
            super.mostraExtrato();
            System.out.println("\n");
        }

    }
}
