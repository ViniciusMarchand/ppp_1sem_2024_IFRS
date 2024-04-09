import commands.Controle;
import commands.CorridaCommand;
import commands.LutaCommand;
import commands.Soccer2024Command;
import models.Corrida;
import models.Luta;
import models.Soccer2024;

public class App {
    public static void main(String[] args) {

        Soccer2024 soccer2024 = new Soccer2024();
        Soccer2024Command soccer2024Command = new Soccer2024Command(soccer2024);

        Luta luta = new Luta();
        LutaCommand lutaCommand = new LutaCommand(luta);

        Corrida corrida = new Corrida();
        CorridaCommand corridaCommand = new CorridaCommand(corrida);


        Controle controle = new Controle();
        controle.setSlot(0, soccer2024Command);
        controle.executeA(0);
        controle.executeB(0);
        System.out.println("====================");
        controle.setSlot(0, lutaCommand);
        controle.executeA(0);
        controle.executeB(0);
        System.out.println("====================");
        controle.setSlot(0, corridaCommand);
        controle.executeA(0);
        controle.executeB(0);

    }
}