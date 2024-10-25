package com.frases.filmes.control;

import com.frases.filmes.dto.FrasesDTO;
import com.frases.filmes.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FrasesDTO obterFraseAleatorio(){
        return servico.obterFraseAleatorio();
    }
}
