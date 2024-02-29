package personagens;
import armas.Arma;

public abstract class Personagem {
    private String nome;
    private Arma arma;
    private String personagem = "Civil";

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
    
    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPersonagem() {
        return this.personagem;
    }

    
    public void verPersonagem() {

        System.out.println(this.getPersonagem());
        System.out.println(getArma().toString());

    }
}
