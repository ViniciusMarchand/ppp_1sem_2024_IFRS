public class App {
    public static void main(String[] args) {
        CatalogoLocadora catalogo = new CatalogoLocadora();

        DVD dvdMatrix = new DVD("The Matrix", "Lana Wachowski, Lilly Wachowski", 136);
        catalogo.adicionarDVD("Matrix", dvdMatrix);

        DVD dvdInception = new DVD("Inception", "Christopher Nolan", 148);
        catalogo.adicionarDVD("Inception", dvdInception);

        DVD copiaMatrix1 = catalogo.obterCopia("Matrix");
        DVD copiaMatrix2 = catalogo.obterCopia("Matrix");

        DVD copiaInception1 = catalogo.obterCopia("Inception");
        DVD copiaInception2 = catalogo.obterCopia("Inception");

        System.out.println(copiaMatrix1.hashCode());
        System.out.println(dvdMatrix.hashCode());

        copiaMatrix1.exibirDetalhes();
        copiaMatrix2.exibirDetalhes();
        copiaInception1.exibirDetalhes();
        copiaInception2.exibirDetalhes();    
    }        
}