package br.com.desafio.dominio;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Filme extends Conteudo{

    public Filme() {
    }

    public Filme(BigDecimal duracao, Set<Ator_Atriz> atores_Atrizes, Set<Diretor_a> diretor_as) {
        this.duracao = duracao;
        this.atores_Atrizes = atores_Atrizes;
        this.diretor_as = diretor_as;
    }

    private BigDecimal duracao;

    private Set<Ator_Atriz> atores_Atrizes = new LinkedHashSet<>();

    private Set<Diretor_a> diretor_as = new HashSet<>();

    public BigDecimal getDuracao() {
        return duracao;
    }

    public void setDuracao(BigDecimal duracao) {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausar'");
    }
}
