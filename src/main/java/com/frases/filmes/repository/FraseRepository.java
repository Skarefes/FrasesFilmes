package com.frases.filmes.repository;

import com.frases.filmes.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frases, Long> {

    @Query("select f from Frases f order by function('RANDOM') Limit 1")
    Frases buscaFraseRandom();
}
