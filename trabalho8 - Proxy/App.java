
import java.time.LocalDate;

import models.Carro;
import models.CarroProxy;
import models.Empregado;


public class App {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Vinicius", LocalDate.parse("2006-09-14"), "123456789");

        Carro carro1 = new Carro(2003, "2314", "qlqr uma", "132312421", "525235");
        CarroProxy carroProxy = new CarroProxy(carro1);

        carroProxy.manobrar(empregado);
    }
}