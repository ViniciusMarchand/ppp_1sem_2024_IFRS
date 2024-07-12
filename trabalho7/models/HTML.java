package models;
import java.io.File;
import java.io.FileWriter;

public class HTML {
    protected String titulo;
    protected String corpo;

    public HTML(String titulo) {
        this.titulo = titulo; 
        this.corpo ="";
    }

    public String getHTML() {
        return this.corpo;
    }

    public String getCorpo() {
        return this.corpo;
    }   

    public String getTitulo() {
        return this.titulo;
    }

    public void gerarHTML() {
        try {
            
            File file = new File("index.html");
            file.delete();
            file.createNewFile();
            
            FileWriter fileWriter = new FileWriter("index.html");
            fileWriter.write(this.getHTML());
        
            fileWriter.close();     
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
