package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Cliente extends Pessoa {
    public Cliente(int id, String nome, String nomeMae, String cpf, Endereco endereco) {
        super(id, nome);
        this.nomeMae = nomeMae;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    private String nomeMae;
    private String cpf;
    private Endereco endereco;

}