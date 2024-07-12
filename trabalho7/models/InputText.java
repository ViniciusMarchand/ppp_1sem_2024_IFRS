package models;
public class InputText extends Decorator{

    public InputText(HTML html) {
        super(html);
        this.corpo = "<input type='text' />\n";
    }
}
