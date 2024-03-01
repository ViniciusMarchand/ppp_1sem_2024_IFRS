package interfaces;

public interface Subject {
    public void addObersver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyOberver(String mensagem);
    public void changeState(float valor);
}
