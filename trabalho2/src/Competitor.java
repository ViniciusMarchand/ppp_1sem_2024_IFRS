import interfaces.Observer;

public class Competitor implements Observer{
    private String nome;

    Competitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String mensagem) {
        System.out.println(this.nome + " foi notificado que agora o maior valor é R$ " + mensagem);
        
    }
}
