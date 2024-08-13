package com.singleton.singleton.models;

public abstract class Linguagem {
    protected String configuracao;
    protected String trocarTema;
    protected String trocarNome;
    protected String bemVindo;
    protected String trocarLingua;
    protected String linguagem;
    protected String nomeUsuarioAtual;
    protected String temaAtual;
    protected String linguagemAtual;
    protected String verConfiguracoesAplicadas;

    public String getConfiguracao() {
        return configuracao;
    }
    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
    public String getTrocarTema() {
        return trocarTema;
    }
    public void setTrocarTema(String trocarTema) {
        this.trocarTema = trocarTema;
    }
    public String getTrocarNome() {
        return trocarNome;
    }
    public void setTrocarNome(String trocarNome) {
        this.trocarNome = trocarNome;
    }
    public String getBemVindo() {
        return bemVindo;
    }
    public void setBemVindo(String bemVindo) {
        this.bemVindo = bemVindo;
    }
    public String getTrocarLingua() {
        return trocarLingua;
    }
    public void setTrocarLingua(String trocarLingua) {
        this.trocarLingua = trocarLingua;
    }
    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    
    
}
