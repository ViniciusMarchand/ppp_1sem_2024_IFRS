package armas;

public class Faca implements Arma {
    private String nome = "Faca";
    private int dano = 3;

    public void darDano() {
        System.out.println(dano);    
    }

    public String toString() {
        return nome;
    }
}
