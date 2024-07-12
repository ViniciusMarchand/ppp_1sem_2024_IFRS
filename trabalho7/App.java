import models.A;
import models.Div;
import models.HTML;
import models.InputText;
import models.Label;
import models.P;

public class App {
    public static void main(String[] args) {
        HTML html = new HTML("Titulo");

        html = new Label(html, "label");
        html = new InputText(html);
        html = new P(html, "paragrafo");
        html = new A(html, "Github Vinicius Marchand", "http://github.com/viniciusmarchand");
        html = new Div(html, new P(html, "paragrafo dentro de div"));
        html = new Div(html, "texto div");

        System.out.println(html.getHTML());

        html.gerarHTML();
    }
}