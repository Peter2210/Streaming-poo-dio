package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Serie extends Conteudo{

    private int numEpisodios;

    private Set<Episodio> episodios = new LinkedHashSet<>();

    private Set<Ator_Atriz> elencoPrincipal = new HashSet<>();

    private Set<Diretor_a> diretoresPrincipais = new HashSet<>();

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public Set<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Set<Episodio> episodios) {
        this.episodios = episodios;
    }

    public Set<Ator_Atriz> getElencoPrincipal() {
        return elencoPrincipal;
    }

    public void setElencoPrincipal(Set<Ator_Atriz> elencoPrincipal) {
        this.elencoPrincipal = elencoPrincipal;
    }

    public Set<Diretor_a> getDiretoresPrincipais() {
        return diretoresPrincipais;
    }

    public void setDiretoresPrincipais(Set<Diretor_a> diretoresPrincipais) {
        this.diretoresPrincipais = diretoresPrincipais;
    }

    @Override
    public void iniciar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }

    
}
