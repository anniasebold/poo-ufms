/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1;

/**
 *
 * @author anniasebold
 */
public final class Apostador {
    String nome;
    String cpf;
    String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    Apostador(String cpf, String nome, String endereco) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(endereco);
    }
    
}
