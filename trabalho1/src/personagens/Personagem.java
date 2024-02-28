package personagens;
import armas.Arma;

public abstract class Personagem {
    private String nome;
    private Arma arma;

    Personagem(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public Arma getArma() {
        return arma;
    }

    public void equipar(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        this.arma.darDano();
    }
    
}
