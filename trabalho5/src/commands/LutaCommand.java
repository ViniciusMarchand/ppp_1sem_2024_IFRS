package commands;

import interfaces.Command;
import models.Luta;

public class LutaCommand implements Command{
    private Luta luta;
    public LutaCommand(Luta luta) {
        this.luta = luta;
    }

    @Override
    public void executeA() {
        this.luta.executeA();
    }

    @Override
    public void executeB() {
        this.luta.executeB();;
    }
    
}
