/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;
 
public class Pessoa {
    private String nome;
    private String cpf;
 
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
 
    // Métodos getter para acessar os atributos privados
    public String getNome() {
        return nome;
    }
 
    public String getCpf() {
        return cpf;
    }
}