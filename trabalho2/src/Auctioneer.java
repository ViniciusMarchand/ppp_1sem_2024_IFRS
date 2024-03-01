import java.util.ArrayList;

import interfaces.Observer;
import interfaces.Subject;

public class Auctioneer implements Subject{
    private String nome;
    private float maiorValor = 0;

    Auctioneer(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    ArrayList<Observer> competitorsList = new ArrayList<Observer>();

    @Override
    public void addObersver(Observer observer) {
        competitorsList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.competitorsList.remove(observer);
    }

    @Override
    public void notifyOberver(String mensagem) {
        for (int i = 0; i < competitorsList.size(); i++) {
            competitorsList.get(i).update(mensagem);
        }
    }

    @Override
    public void changeState(float valor) {
        if(valor > maiorValor) {
            this.maiorValor = valor;
            notifyOberver(Float.toString(this.maiorValor));
        }
    }
    
}
