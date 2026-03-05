package br.com.desafio.dominio;

import java.time.LocalDate;

public abstract class Conteudo {

    private static long SEQUENCIA = 1;

    private long id = SEQUENCIA++;

    private String nome;

    private LocalDate dataLancamento;

    private String descricao;

    private int idadeMediaRecomendada;

    private boolean reproduzindo = false;

    public long getId() {
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

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdadeMediaRecomendada() {
        return idadeMediaRecomendada;
    }

    public void setIdadeMediaRecomendada(int idadeMediaRecomendada) {
        this.idadeMediaRecomendada = idadeMediaRecomendada;
    }

        public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
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
        Conteudo other = (Conteudo) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public abstract void iniciar();

    public abstract void pausar();
}
