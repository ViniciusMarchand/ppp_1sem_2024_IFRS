package templace.method.com;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class ExportacaoXML extends Exportacao{

    ExportacaoXML(String nomeCSV, String nomeNovoArquivo) {
        super(nomeCSV, nomeNovoArquivo);
    }

    @Override
    protected void exportarComo(ArrayList<String[]> dados) {
        try {

            FileWriter fileWriter = new FileWriter(nomeNovoArquivo + ".xml");
            String head = "";
            
            for (int i = 0; i < dados.get(0).length; i++) {
                head += dados.get(0)[i] + " ";
            }

            fileWriter.write(head + "\n");
            String body = "";
            for (int i = 1; i < dados.size(); i++) {
                for (int j = 0; j < dados.get(0).length; j++) {
                    body += dados.get(i)[j] + " ";
                }
                
                fileWriter.write(body + "\n");
                body = "";
            }

            fileWriter.close();     
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
