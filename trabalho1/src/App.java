import armas.Arco;
import armas.Espada;
import armas.Faca;
import armas.Machado;
import personagens.Cavaleiro;
import personagens.Rainha;
import personagens.Rei;

public class App {
    public static void main(String[] args) {
        Rei rainha = new Rei("Pedro");
        Faca faca = new Faca();
        Espada espada = new Espada();
        Arco arco = new Arco();
        Machado machado = new Machado();
        rainha.equipar(espada);

        rainha.verPersonagem();
        rainha.atacar();
    }
}