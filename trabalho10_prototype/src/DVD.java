class DVD implements Cloneable {
    private String titulo;
    private String diretor;
    private int duracao;
 
    public DVD(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    @Override
    public DVD clone() {
        return new DVD(titulo, diretor, duracao);
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + ", Diretor: " + diretor + ", Duração: " + duracao + " minutos");
    }
}
