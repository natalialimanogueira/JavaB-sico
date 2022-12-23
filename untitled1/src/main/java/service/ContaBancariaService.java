package service;

import java.lang.constant.Constable;

public class ServiseContaBancaria implements ContaBancaria {

    private Double saldo ;
    private final

    public Double sacar(Double valor) {
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Transação de saque realisada com sucesso.");
            System.out.println(atualizarSaldoAposTrasaçoes());
        } else {
            System.out.println("Não foi possivel realizar a transação");
            System.out.println("O valor solicitado foi superior ao valor disponivel no saldo");
            System.out.println(atualizarSaldoAposTrasaçoes());
        }
        return valor;
    }

    public Double depositar(Double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + valor;
            System.out.println("Transação de depósito realisada com sucesso.");
            System.out.println("Saldo atual na conta é :" + saldo);
            System.out.println(atualizarSaldoAposTrasaçoes());
        } else {
            System.out.println("Não foi possivel realizar a transação. O valor precisa ser maior que zero");
            System.out.println(atualizarSaldoAposTrasaçoes());
        }
        return valor;
    }
    public Double atualizarSaldoAposTrasaçoes() {
        return this.saldo;
    }
}
