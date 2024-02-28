package personagens;


public class Cavaleiro extends Personagem {

    public Cavaleiro(String nome) {
        super(nome);
    }

    private String personagem = "Cavaleiro";

    public void verPersonagem() {

        System.out.println(personagem);
        System.out.println(getArma().toString());

    }

    

}
