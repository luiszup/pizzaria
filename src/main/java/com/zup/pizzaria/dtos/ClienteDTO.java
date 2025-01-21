package com.zup.pizzaria.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class ClienteDTO {
    @NotBlank(message = "O nome não pode estar vazio.")
    private String nome;

    @NotBlank(message = "O e-mail não pode estar vazio.")
    @Email(message = "E-mail inválido! Digite um e-mail válido.")
    private String email;

    @NotBlank(message = "O telefone não pode estar vazio.")
    @Pattern(regexp = "\\d{8,}", message = "Telefone inválido! Digite apenas números e que tenha no mínimo 8 dígitos.")
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
}
