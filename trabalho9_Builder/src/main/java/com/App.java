package com;

import java.time.LocalDate;
import java.util.ArrayList;

import com.models.Cliente;
import com.models.Endereco;
import com.models.Item;
import com.models.Pedido;
import com.models.Produto;
import com.models.Vendedor;

public class App 
{
    public static void main( String[] args ) {

        Vendedor vendedor = new Vendedor(1, "João", LocalDate.now());
        Cliente cliente = new Cliente(1, "Igor", "Joana", "11111111111",new Endereco(1, "alfredo huch", "bgv", "1000", "sem complemento"));

        Produto produto1 = new Produto(1, "Produto1", 100, 2);
        Produto produto2 = new Produto(2, "Produto2", 200, 3);

        ArrayList<Item> items = new ArrayList<Item>();
        Item item1 = new Item(1, produto1, 2, produto1.getPreco());
        Item item2 = new Item(2, produto2, 4, produto2.getPreco());
        items.add(item1);
        items.add(item2);
        
        Pedido pedido = Pedido.builder().id(1).vendedor(vendedor).cliente(cliente).items(items).build();      
        System.out.println(pedido);
        System.out.println(pedido.getId());  
        System.out.println(pedido.getCliente());  
        System.out.println(pedido.getVendedor());  


    }
}
