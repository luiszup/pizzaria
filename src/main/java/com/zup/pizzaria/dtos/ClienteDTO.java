package com.zup.pizzaria.dtos;

import com.zup.pizzaria.models.Cliente;

public class ClienteDTO {
    private String nome;
    private String email;
    private String telefone;

    public ClienteDTO(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void validar() {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        if (email == null || email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("E-mail inválido! Digite um e-mail válido.");
        }
        if (telefone == null || telefone.matches("\\d{8,}")) {
            throw new IllegalArgumentException("Telefone inválido! Digite apenas números e que tenha no mínimo 8 dígitos.");
        }
    }
}
