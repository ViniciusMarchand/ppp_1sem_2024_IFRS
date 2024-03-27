package trabalho4.models;

public class MaquinaComMoeda extends MaquinaState{

    public MaquinaComMoeda(MaquinaChiclete maquinaChiclete) {
        super(maquinaChiclete);
    }

    @Override
    public void acionaAlavanca() {
        maquinaChiclete.setNumGomas(maquinaChiclete.getNumGomas() - 1);
        maquinaChiclete.setEstadoAtual(new MaquinaGomaVendida(maquinaChiclete));
    }

    @Override
    public void ejetaMoeda() {
        maquinaChiclete.setEstadoAtual(new MaquinaSemMoeda(maquinaChiclete));
    }

    @Override
    public void insereMoeda() {
        System.out.println("A moeda já está inserida!");
    }

    @Override
    public void entregaGoma() {
        System.out.println("Goma ainda não foi vendida!");

    }

}
