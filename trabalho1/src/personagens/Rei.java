package personagens;

public class Rei extends Personagem {
    Rei(String nome) {
        super(nome);

    }

    private String personagem = "Rei";

    public void verPersonagem() {

        System.out.println(personagem);
        System.out.println(getArma().toString());

    }
}
