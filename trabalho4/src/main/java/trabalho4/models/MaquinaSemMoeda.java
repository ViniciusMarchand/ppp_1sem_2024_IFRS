package trabalho4.models;

public class MaquinaSemMoeda extends MaquinaState {

    public MaquinaSemMoeda(MaquinaChiclete maquinaChiclete) {
        super(maquinaChiclete);
    }

    @Override
    public void acionaAlavanca() {
        
        System.out.println("Máquina precisa ter moeda para acionar a alavanca!");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("Máquina precisa ter moeda para ejetar a moeda!");
    }

    @Override
    public void insereMoeda() {
        maquinaChiclete.setEstadoAtual(new MaquinaComMoeda(maquinaChiclete));
    }

    @Override
    public void entregaGoma() {
        System.out.println("Goma ainda não foi vendida!");
    }

    

}


