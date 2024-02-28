package personagens;

public class Rainha extends Personagem {

    Rainha(String nome) {
        super(nome);

    }

    private String personagem = "Rainha";

    public void verPersonagem() {

        System.out.println(personagem);
        System.out.println(getArma().toString());

    }
}
