package armas;

public class Espada implements Arma {
    private String nome = "Espada";
    private int dano = 5;

    public void darDano() {
        System.out.println(dano);    
    }

    public String toString() {
        return nome;
    }
}
