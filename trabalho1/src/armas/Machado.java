package armas;

public class Machado implements Arma{
    private String nome = "Machado";
    private int dano = 8;

    public void darDano() {
        System.out.println(dano);    
    }

    public String toString() {
        return nome;
    }
}
