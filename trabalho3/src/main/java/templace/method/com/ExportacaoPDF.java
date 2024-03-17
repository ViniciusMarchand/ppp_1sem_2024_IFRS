package templace.method.com;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class ExportacaoPDF extends Exportacao {
        


    
    ExportacaoPDF(String nomeCSV, String nomeNovoArquivo) {
        super(nomeCSV, nomeNovoArquivo);
    }

    @Override
    public void exportarComo(ArrayList<String[]> dados) {
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(super.nomeNovoArquivo + ".pdf"));
            doc.open();
            
            for (int i = 0; i < dados.size(); i++) {
                String line = "";
                for (int j = 0; j < dados.get(0).length; j++) {
                    line += dados.get(i)[j] + " | ";
                }
                Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
                System.out.println(line);
                Paragraph chunk = new Paragraph(line, font);
                doc.add(chunk);
            }

    
            doc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}