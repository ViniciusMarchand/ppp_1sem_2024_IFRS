package com.singleton.singleton.models;

public class Configuracao {
    
    private static final Configuracao instance = new Configuracao();
    private String temaAtual = "light";
    private Linguagem idiomaAtual = new Portugues();
    private String nomeUsuario = "'sem nome / no name'";
    
    private Configuracao(){}

    public static synchronized Configuracao getInstance(){
        return instance;
    }

    public String getTemaAtual() {
        return temaAtual;
    }

    public void toggleTema(){
        if(temaAtual.equals("light")){
            temaAtual = "dark";
        } else {
            temaAtual = "light";
        }
    }

    public void toggleLinguagem(){
        if(idiomaAtual instanceof Portugues){
            idiomaAtual = new Ingles();
        } else {
            idiomaAtual = new Portugues();
        }
    }

    public Linguagem getIdiomaAtual() {
        return idiomaAtual;
    }

    public void setNomeUsuario(String nome) {
        nomeUsuario = nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
}
