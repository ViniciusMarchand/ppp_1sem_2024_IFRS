package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String complemento;
    private String nro;

    public Endereco(int id, String rua, String bairro, String complemento, String nro){
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.nro = nro;
    }

}