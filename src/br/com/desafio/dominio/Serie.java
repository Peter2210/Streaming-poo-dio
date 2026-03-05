package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Serie extends Conteudo{

    public Serie() {
    }

    public Serie(int numEpisodios, Set<Episodio> episodios, Set<Ator_Atriz> elencoPrincipal, Set<Diretor_a> diretoresPrincipais) {
        this.numEpisodios = numEpisodios;
        this.episodios = episodios;
        this.elencoPrincipal = elencoPrincipal;
        this.diretoresPrincipais = diretoresPrincipais;
    }

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

    public void iniciarEpisodio(int numeroEpisodio) {
        episodios.stream()
            .filter(ep -> ep.getNumEpisodio() == numeroEpisodio)
            .findFirst()
            .ifPresentOrElse(
                Episodio::iniciar,
                () -> System.out.println("Episódio não encontrado")
            );
    }

    public void pausarEpisodio(int numeroEpisodio) {
        episodios.stream()
            .filter(ep -> ep.getNumEpisodio() == numeroEpisodio)
            .findFirst()
            .ifPresentOrElse(
                Episodio::pausar,
                () -> System.out.println("Episódio não encontrado")
            );
    }

    @Override
    public void iniciar() {
        System.out.println("Escolha episódio a ser reproduzido:\n");
        episodios.forEach(
            ep -> System.out.printf("Episodio %i - %s \n", ep.getNumEpisodio(), ep.getNome())
        );
        System.out.println("Episódio: ");
        Scanner scanner = new Scanner(System.in);
        int epEscolha = scanner.nextInt();
        iniciarEpisodio(epEscolha);
        scanner.close();
    }

    @Override
    public void pausar() {
        System.out.println("Escolha episódio a ser pausado:\n");
        episodios.forEach(
            ep -> System.out.printf("Episodio %i - %s", ep.getNumEpisodio(), ep.getNome())
        );
        System.out.println("Episódio: ");
        Scanner scanner = new Scanner(System.in);
        int epEscolha = scanner.nextInt();
        iniciarEpisodio(epEscolha);
        pausarEpisodio(epEscolha);
        scanner.close();
    }
}
