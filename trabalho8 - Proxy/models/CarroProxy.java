package models;

import models.interfaces.ICarro;

public class CarroProxy implements ICarro {
    
    private Carro carro;

    public CarroProxy(Carro carro) {
       this.carro = carro;
    }

    @Override
    public void manobrar(Empregado empregado) {
        if(empregado.getIdade() >= 18) {
            carro.manobrar(empregado);
        } else {
            System.out.println("Empregado não pode manobrar o carro, pois é menor de idade");
        }
    }
    
}
