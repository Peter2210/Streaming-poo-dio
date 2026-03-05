package br.com.desafio.dominio;

import java.util.Set;

public class Ator_Atriz extends Profissional{

    public Ator_Atriz() {
    }

    public Ator_Atriz(long id, String nome, int idade, String descricao, Set<Filme> historicoFilme,
            Set<Serie> historicoSerie) {
        super(id, nome, idade, descricao, historicoFilme, historicoSerie);
    }
    
}
