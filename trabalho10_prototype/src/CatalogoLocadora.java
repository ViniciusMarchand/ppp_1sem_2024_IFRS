import java.util.HashMap;
import java.util.Map;
class CatalogoLocadora {
    private Map<String, DVD> catalogo = new HashMap<>();

    public void adicionarDVD(String chave, DVD dvd) {
        catalogo.put(chave, dvd);
    }

    public DVD obterCopia(String chave) {
        DVD dvd = catalogo.get(chave);
        return dvd.clone();
    }
}