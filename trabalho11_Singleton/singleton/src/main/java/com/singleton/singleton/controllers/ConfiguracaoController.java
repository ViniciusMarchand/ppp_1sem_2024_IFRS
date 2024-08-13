package com.singleton.singleton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.singleton.singleton.models.Configuracao;

@Controller
public class ConfiguracaoController {
    @GetMapping("/toggle-tema")
    public void toggleTema() {
        Configuracao configuracao = Configuracao.getInstance();
        configuracao.toggleTema(); 
    }

    @GetMapping("/change-nome-usuario")
    public String trocarNomeUsuario(@RequestParam String nome) {
        Configuracao configuracao = Configuracao.getInstance();
        configuracao.setNomeUsuario(nome);
        return configuracao.getNomeUsuario(); 
    }

    @GetMapping("/change-lingua")
    public void trocaLingua() {
        Configuracao configuracao = Configuracao.getInstance();
        configuracao.toggleLinguagem();
    }
}
