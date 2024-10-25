package com.frases.filmes.service;

import com.frases.filmes.dto.FrasesDTO;
import com.frases.filmes.model.Frases;
import com.frases.filmes.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FrasesDTO obterFraseAleatorio(){
        Frases frase= repositorio.buscaFraseRandom();
        return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
