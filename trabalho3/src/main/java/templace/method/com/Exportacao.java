package templace.method.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class Exportacao {

    private String nomeCSV;
    protected String nomeNovoArquivo;
    private ArrayList<String[]> dados = new ArrayList<>();

    Exportacao(String nomeCSV, String nomeNovoArquivo) {
        this.nomeCSV = nomeCSV;
        this.nomeNovoArquivo = nomeNovoArquivo;

    }

    final public void exportar() {
        BufferedReader bufferedReader = lerCSV();
        formatarDado(bufferedReader);
        exportarComo(dados);
    }
    
    private BufferedReader lerCSV() {
        
        try {
            FileReader file = new FileReader(nomeCSV + ".csv");
            return new BufferedReader(file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void formatarDado(BufferedReader br) {
        String line = "";
        String splitBy = ";"; 
        try {
            while ((line = br.readLine()) != null) {
                String cadastro[] = line.split(splitBy);
                dados.add(cadastro);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected abstract void exportarComo(ArrayList<String[]> dados);
    
    public ArrayList<String[]> getDados() {
        return dados;
    }
}
