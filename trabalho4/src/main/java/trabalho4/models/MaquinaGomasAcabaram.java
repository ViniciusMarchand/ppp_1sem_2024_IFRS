package trabalho4.models;

public class MaquinaGomasAcabaram extends MaquinaState{

    public MaquinaGomasAcabaram(MaquinaChiclete maquinaChiclete) {
        super(maquinaChiclete);
    }

    @Override
    public void acionaAlavanca() {
       System.out.println("Máquina não tem mais gomas");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Máquina não tem mais gomas");

    }

    @Override
    public void insereMoeda() {
        System.out.println("Máquina não tem mais gomas");

    }

    @Override
    public void entregaGoma() {
        System.out.println("Máquina não tem mais gomas");

    }

}
