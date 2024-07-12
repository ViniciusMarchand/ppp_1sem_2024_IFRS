package models;
public class Div extends Decorator{

    public Div(HTML html, String text) {
        super(html);
        this.corpo = "<div>" + text + "</div>\n";
    }

    public Div(HTML html, HTML outroHtml) {
        super(html);

        this.corpo ="<div>\n" + outroHtml.corpo + "</div>\n";
    }
}
