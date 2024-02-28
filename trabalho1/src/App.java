import armas.Arco;
import armas.Espada;
import armas.Faca;
import armas.Machado;
import personagens.Cavaleiro;

public class App {
    public static void main(String[] args) {
        Cavaleiro cavaleiro = new Cavaleiro("Pedro");
        Faca faca = new Faca();
        Espada espada = new Espada();
        Arco arco = new Arco();
        Machado machado = new Machado();
        cavaleiro.equipar(espada);

        cavaleiro.verPersonagem();
        cavaleiro.atacar();
    }
}