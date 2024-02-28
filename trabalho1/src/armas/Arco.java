package armas;

public class Arco implements Arma {
    private String nome = "Arco";
    private int dano = 3;

    public void darDano() {
        System.out.println(dano);    
    }

    public String toString() {
        return nome;
    }
}
