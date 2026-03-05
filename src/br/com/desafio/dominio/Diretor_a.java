package br.com.desafio.dominio;

import java.util.Set;

public class Diretor_a extends Profissional{

    public Diretor_a(long id, String nome, int idade, String descricao, Set<Filme> historicoFilme,
            Set<Serie> historicoSerie) {
        super(id, nome, idade, descricao, historicoFilme, historicoSerie);
    }

    public Diretor_a() {
    }
    
}
