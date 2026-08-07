/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sistemabancario;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private Pessoa titular; // Relação com a classe Pessoa

    public ContaBancaria(int numeroDaConta, Pessoa titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = 0.0; // Conta inicia zerada
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado! Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void exibirTitular() {
        System.out.println("Titular: " + titular.getNome() + " (CPF: " + titular.getCpf() + ")");
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }
}