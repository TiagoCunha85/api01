package br.com.aula01.api01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.aula01.api01.Model.Pessoa;

@RestController

public class Controle {

    @GetMapping("")
    public String inicio() {
        return "Ola. Tudo bem?";
    }

    @GetMapping("/inicio/{nome}")
    public String PegarNome(@PathVariable String nome) {
        return "Ola. " + nome + ". Tudo bem?";
    }

    @PostMapping("/pessoa")
    public Pessoa Pessoa(@RequestBody Pessoa P) {
        return P;
    }
}
