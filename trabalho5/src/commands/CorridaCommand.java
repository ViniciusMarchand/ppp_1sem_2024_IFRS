package commands;

import interfaces.Command;
import models.Corrida;

public class CorridaCommand implements Command{
    private Corrida corrida;

    public CorridaCommand(Corrida corrida) {
        this.corrida = corrida;
    }

    @Override
    public void executeA() {
        this.corrida.executeA();
    }

    @Override
    public void executeB() {
        this.corrida.executeB();
    }
    
}
