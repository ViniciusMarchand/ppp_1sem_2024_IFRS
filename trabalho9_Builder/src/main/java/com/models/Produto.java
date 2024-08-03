package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Produto {
    private int id;
    private String nome;
    private int qtdeEstoque;
    private double preco;

    public Produto(int id, String nome, int qtdeEstoque, double preco){
        this.id = id;
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.preco = preco;
    }

}
