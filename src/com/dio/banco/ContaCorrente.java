package com.dio.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
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
