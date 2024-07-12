package models;
public class A extends Decorator{

    public A(HTML html, String text, String link) {
        super(html);
        this.corpo = "<a href='" + link + "'>" + text + "</a>\n";
    }
}
