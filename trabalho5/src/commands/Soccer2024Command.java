package commands;

import interfaces.Command;
import models.Soccer2024;

public class Soccer2024Command implements Command {

    private Soccer2024 soccer2024;

    public Soccer2024Command(Soccer2024 soccer2024) {
        this.soccer2024 = soccer2024;
    }
    @Override
    public void executeA() {
        this.soccer2024.executeA();
    }

    @Override
    public void executeB() {
        this.soccer2024.executeB();
    }
    

}