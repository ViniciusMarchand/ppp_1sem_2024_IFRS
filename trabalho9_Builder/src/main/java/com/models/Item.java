package com.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Item {
    private int id;
    private Produto produto;
    private int qtde;
    private double preco;

    public Item(int id, Produto produto, int qtde, double preco){
        this.id = id;
        this.produto = produto;
        this.qtde = qtde;
        this.preco = preco;
    }

}