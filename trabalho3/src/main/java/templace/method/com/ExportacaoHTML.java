package templace.method.com;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class ExportacaoHTML extends Exportacao {

    ExportacaoHTML(String nomeCSV, String nomeNovoArquivo) {
        super(nomeCSV, nomeNovoArquivo);
    }

    @Override
    protected void exportarComo(ArrayList<String[]> dados) {
        try {
            File file = new File(nomeNovoArquivo + ".html");
            file.createNewFile();

            FileWriter fileWriter = new FileWriter(nomeNovoArquivo + ".html");
            fileWriter.write("<table>");
            String head = "";
            
            for (int i = 0; i < dados.get(0).length; i++) {
                head += "<th>" + dados.get(0)[i] + "</th>";
            }

            fileWriter.write("<thead><tr>" + head + "</tr></thead><tbody>");
            String body = "";
            for (int i = 1; i < dados.size(); i++) {
                for (int j = 0; j < dados.get(0).length; j++) {
                    body += "<td>" + dados.get(i)[j] + "</td>";
                }
                
                fileWriter.write("<tr>" + body + "</tr>");
                body = "";
            }


            fileWriter.write("</tbody></table>");
            fileWriter.close();     
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
