package models;
import models.interfaces.ICarro;

public class Carro implements ICarro {
    
    private int ano;
    private String modelo;
    private String marca;
    private String placa; 
    private String chassi;

    public Carro(int ano, String modelo, String marca, String placa, String chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void manobrar (Empregado empregado) {
        System.out.println("Carro manobrado por " + empregado.getNome());
    }
}
