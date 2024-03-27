package trabalho4.models;

public class MaquinaChiclete {
    private int numGomas = 3;    
    private MaquinaState estadoAtual;
    
    public MaquinaChiclete() {
        this.estadoAtual = new MaquinaSemMoeda(this);
    }
    
    
    public void acionarAlavanca() {
        this.estadoAtual.acionaAlavanca();
    }
    
    public void ejetaMoeda() {
        this.estadoAtual.ejetaMoeda();
    }
    
    
    public void insereMoeda() {
        this.estadoAtual.insereMoeda();
    }
    
    public void entregaGome() {
        this.estadoAtual.entregaGoma();
    }
    
    public void mostraEstadoAtualString() {
        System.out.println(estadoAtual.getClass().getSimpleName());
    }
    
    public void setEstadoAtual(MaquinaState estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public int getNumGomas() {
        return numGomas;
    }

    public void setNumGomas(int num) {
        this.numGomas = num;
    }
    
}
