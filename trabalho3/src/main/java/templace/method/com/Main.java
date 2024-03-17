package templace.method.com;
import java.io.BufferedReader;
import java.io.FileReader;  
public class Main {
    public static void main(String[] args) {
        //NÃO PRECISA COLOCAR AS EXTENSÕES DOS ARQUIVOS
        ExportacaoPDF ex = new ExportacaoPDF("cadastro", "teste");
        ex.exportar();
    }
}