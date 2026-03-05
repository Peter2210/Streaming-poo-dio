package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Profissional {

    public Profissional() {
    }

    public Profissional(long id, String nome, int idade, String descricao, Set<Filme> historicoFilme,
            Set<Serie> historicoSerie) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
        this.historicoFilme = historicoFilme;
        this.historicoSerie = historicoSerie;
    }

    private long id;

    private String nome;

    private int idade;

    private String descricao;

    private Set<Filme> historicoFilme = new LinkedHashSet<>();

    private Set<Serie> historicoSerie = new LinkedHashSet<>();

    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Filme> getHistoricoFilme() {
        return historicoFilme;
    }

    public void adicionarHistoricoFilme(Filme filme) {
        this.historicoFilme.add(filme);
    }

    public Set<Serie> getHistoricoSerie() {
        return historicoSerie;
    }

    public void adicionarHistoricoSerie(Serie serie) {
        this.historicoSerie.add(serie);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profissional other = (Profissional) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
