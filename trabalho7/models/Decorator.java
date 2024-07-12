package models;

public abstract class Decorator extends HTML {
    
    private HTML html;

    public Decorator(HTML html) {
        super(html.getTitulo());
        this.html = html;
    }

    
    public String getHTML() {
        return  "<html>\r\n" + //
        "<title>" + this.titulo + "</title>\r\n" + //
        "<body>\r\n" + //
        getCorpo() +"\r\n" + //
        "</body>\r\n" + //
        "</html>";
    }
    
    public String getCorpo() {
        return this.html.getCorpo() + this.corpo;
    }  
}
