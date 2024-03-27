package trabalho4.models;

public class MaquinaGomaVendida extends MaquinaState{

    public MaquinaGomaVendida(MaquinaChiclete maquinaChiclete) {
        super(maquinaChiclete);
    } 

    @Override
    public void acionaAlavanca() {
        System.out.println("A goma precisa ser entregue primeiro!");
    }

    @Override
    public void ejetaMoeda() {
        System.out.println("A goma precisa ser entregue primeiro!");

    }

    @Override
    public void insereMoeda() {
        System.out.println("A goma precisa ser entregue primeiro!");

    }

    @Override
    public void entregaGoma() {
        if(maquinaChiclete.getNumGomas() > 0) {
            maquinaChiclete.setEstadoAtual(new MaquinaSemMoeda(maquinaChiclete));
        } else {
            maquinaChiclete.setEstadoAtual(new MaquinaGomasAcabaram(maquinaChiclete));
        }
    }


}
