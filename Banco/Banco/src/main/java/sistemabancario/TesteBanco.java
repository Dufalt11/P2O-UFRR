/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;
 
public class TesteBanco {
    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa joao = new Pessoa("João Silva", "123.456.789-00");
 
        // Criando conta bancária para João
        ContaBancaria conta = new ContaBancaria(12345, joao);
 
        // Testando operações
        conta.exibirTitular();
        conta.depositar(1000.0);
        conta.sacar(300.0);
        conta.sacar(800.0); // Tentativa inválida
    }
}