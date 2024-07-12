package models;
public class P extends Decorator{

    public P(HTML html, String text) {
        super(html);
        this.corpo = "<p>" + text + "</p>\n";
    }
}
