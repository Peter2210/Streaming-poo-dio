package br.com.desafio.dominio;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Filme extends Conteudo{

    public Filme() {
    }

    public Filme(Duration duracao, Set<Ator_Atriz> atores_Atrizes, Set<Diretor_a> diretor_as) {
        this.duracao = duracao;
        this.atores_Atrizes = atores_Atrizes;
        this.diretor_as = diretor_as;
    }

    private Duration duracao;

    private Set<Ator_Atriz> atores_Atrizes = new LinkedHashSet<>();

    private Set<Diretor_a> diretor_as = new HashSet<>();

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public Set<Ator_Atriz> getAtores_Atrizes() {
        return atores_Atrizes;
    }

    public void adicionarAtores_Atrizes(Ator_Atriz atores_Atriz) {
        this.atores_Atrizes.add(atores_Atriz);
    }

    public Set<Diretor_a> getDiretor_as() {
        return diretor_as;
    }

    public void adicionarDiretor_as(Diretor_a diretor_as) {
        this.diretor_as.add(diretor_as);
    }

    @Override
    public void iniciar() {
        if(isReproduzindo()){
            System.out.printf("Filme já em reprodução");
        }else{
            setReproduzindo(true);
            System.out.println("Iniciando filme " + this.getNome());
        }
    }

    @Override
    public void pausar() {
        if(!isReproduzindo()){
            System.out.printf("Filme já está pausado");
        }else{
            setReproduzindo(false);
            System.out.println("Pausando filme " + this.getNome());
        }
    }
}
