package trabalho4.models;

public abstract class MaquinaState {
    protected MaquinaChiclete maquinaChiclete;

    public MaquinaState(MaquinaChiclete maquinaChiclete) {
        this.maquinaChiclete = maquinaChiclete;
    }

    public abstract void acionaAlavanca();
    public abstract void ejetaMoeda();
    public abstract void insereMoeda();
    public abstract void entregaGoma();



}
