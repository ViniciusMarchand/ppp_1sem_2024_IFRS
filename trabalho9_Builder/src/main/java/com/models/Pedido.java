package com.models;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;
    
    @Builder
    public Pedido(int id, Cliente cliente, Vendedor vendedor, ArrayList<Item> items){
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.items = items;
    }


}