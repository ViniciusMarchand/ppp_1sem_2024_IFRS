package models;
public class Label extends Decorator{

    public Label(HTML html, String text) {
        super(html);
        this.corpo = "<label>" + text + "</label>\n";
    }
}
