package com.singleton.singleton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.singleton.singleton.models.Configuracao;
import com.singleton.singleton.models.Linguagem;

import org.springframework.ui.Model;

@Controller
public class RoutterController {
    @GetMapping("/singleton")
    public String singleton(Model model) {

        Configuracao configuracao = Configuracao.getInstance();
        
        String tema = configuracao.getTemaAtual();
        String nome = configuracao.getNomeUsuario();
        Linguagem linguagem = configuracao.getIdiomaAtual();
        

        model.addAttribute("tema", tema);
        model.addAttribute("nome", nome);
        model.addAttribute("linguagem", linguagem);
        return "singleton";  
    }

    @GetMapping("/configuracao")
    public String configuracao(Model model) {

        Configuracao configuracao = Configuracao.getInstance();
        
        String tema = configuracao.getTemaAtual();
        String nome = configuracao.getNomeUsuario();
        Linguagem linguagem = configuracao.getIdiomaAtual();
        

        model.addAttribute("tema", tema);
        model.addAttribute("nome", nome);
        model.addAttribute("linguagem", linguagem);
        return "configuracao";  
    }
    
}
