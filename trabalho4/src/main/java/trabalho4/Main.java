package trabalho4;

import trabalho4.models.MaquinaChiclete;

public class Main {
    public static void main(String[] args) {
        MaquinaChiclete maquinaChiclete = new MaquinaChiclete();
        maquinaChiclete.acionarAlavanca();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.ejetaMoeda();
        maquinaChiclete.insereMoeda();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.entregaGome();
        maquinaChiclete.acionarAlavanca();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.entregaGome();
        maquinaChiclete.mostraEstadoAtualString();
        System.out.println(maquinaChiclete.getNumGomas() == 2);
        maquinaChiclete.insereMoeda();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.acionarAlavanca();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.entregaGome();
        maquinaChiclete.mostraEstadoAtualString();
        System.out.println(maquinaChiclete.getNumGomas() == 1);

        maquinaChiclete.insereMoeda();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.acionarAlavanca();
        maquinaChiclete.mostraEstadoAtualString();
        maquinaChiclete.entregaGome();
        maquinaChiclete.mostraEstadoAtualString();
        System.out.println(maquinaChiclete.getNumGomas() == 0);

        maquinaChiclete.insereMoeda();



    }
}