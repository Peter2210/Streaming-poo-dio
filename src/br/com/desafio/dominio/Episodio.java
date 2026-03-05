package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Episodio extends Conteudo{

    public Episodio() {
    }
    
    public Episodio(int numEpisodio, Set<Ator_Atriz> elenco, Set<Diretor_a> diretores) {
        this.numEpisodio = numEpisodio;
        this.elenco = elenco;
        this.diretores = diretores;
    }

    private int numEpisodio;

    private Set<Ator_Atriz> elenco = new HashSet<>();

    private Set<Diretor_a> diretores = new HashSet<>();

    public int getNumEpisodio() {
        return numEpisodio;
    }

    public void setNumEpisodio(int numEpisodio) {
        this.numEpisodio = numEpisodio;
    }

    public Set<Ator_Atriz> getElenco() {
        return elenco;
    }

    public void setElenco(Set<Ator_Atriz> elenco) {
        this.elenco = elenco;
    }

    public Set<Diretor_a> getDiretores() {
        return diretores;
    }

    public void setDiretores(Set<Diretor_a> diretores) {
        this.diretores = diretores;
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
