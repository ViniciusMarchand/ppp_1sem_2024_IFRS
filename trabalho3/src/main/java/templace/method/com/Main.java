package templace.method.com;
public class Main {
    public static void main(String[] args) {
        //NÃO PRECISA COLOCAR AS EXTENSÕES DOS ARQUIVOS
        ExportacaoPDF ex = new ExportacaoPDF("cadastro", "teste");
        ex.exportar();

        ExportacaoHTML exHTML = new ExportacaoHTML("cadastro", "teste");
        exHTML.exportar();

        ExportacaoTXT exTXT = new ExportacaoTXT("cadastro", "teste");
        exTXT.exportar();

        ExportacaoXML exXML = new ExportacaoXML("cadastro", "teste");
        exXML.exportar();
    }
}