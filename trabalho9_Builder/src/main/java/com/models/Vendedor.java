package com.models;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class Vendedor extends Pessoa {

    public Vendedor(int id, String nome, LocalDate inicio) {
        super(id, nome);
        this.inicio = inicio;
    }
    private LocalDate inicio;
    private LocalDate fim;
   
}