import java.time.Duration;
import java.time.LocalDate;

import br.com.desafio.dominio.Ator_Atriz;
import br.com.desafio.dominio.Diretor_a;
import br.com.desafio.dominio.Episodio;
import br.com.desafio.dominio.Filme;
import br.com.desafio.dominio.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Criando profissionais
        Ator_Atriz ator1 = new Ator_Atriz();
        ator1.setNome("Keanu Reeves");
        ator1.setIdade(59);

        Ator_Atriz ator2 = new Ator_Atriz();
        ator2.setNome("Carrie-Anne Moss");

        Diretor_a diretor1 = new Diretor_a();
        diretor1.setNome("Lana Wachowski");


        // Criando os filmes
        Filme filme = new Filme();
        filme.setNome("Matrix");
        filme.setDataLancamento(LocalDate.of(1999, 3, 31));
        filme.setDuracao(Duration.ofMinutes(130));

        filme.adicionarAtores_Atrizes(ator1);
        filme.adicionarAtores_Atrizes(ator2);

        filme.adicionarDiretor_as(diretor1);


        // Criando a série
        Serie serie = new Serie();
        serie.setNome("Stranger Things");

        Episodio ep1 = new Episodio();
        ep1.setNumEpisodio(1);
        ep1.setNome("Capítulo Um");

        Episodio ep2 = new Episodio();
        ep2.setNumEpisodio(2);
        ep2.setNome("Capítulo Dois");

        serie.getEpisodios().add(ep1);
        serie.getEpisodios().add(ep2);


        // Adicionando histórico para os profissionais
        ator1.adicionarHistoricoFilme(filme);
        ator2.adicionarHistoricoFilme(filme);

        diretor1.adicionarHistoricoFilme(filme);

        ator1.adicionarHistoricoSerie(serie);


        // Informações
        System.out.println("===== Profissional =====");
        System.out.println("Ator: " + ator1.getNome());

        System.out.println("Quantidade de filmes: " + ator1.quantidadeFilmes());
        System.out.println("Quantidade de séries: " + ator1.quantidadeSeries());

        ator1.listarFilmes();
        ator1.listarSeries();

        System.out.println("===== Filme =====");

        System.out.println("Nome: " + filme.getNome());
        System.out.println("Duração: " + filme.getDuracao().toMinutes() + " min");

        System.out.println("Atores:");

        filme.getAtores_Atrizes()
                .forEach(a -> System.out.println("- " + a.getNome()));

        System.out.println("Diretores:");

        filme.getDiretor_as()
                .forEach(d -> System.out.println("- " + d.getNome()));

        System.out.println("===== Serie =====");
        System.out.println("Nome: " + serie.getNome());
        System.out.println("Quantidade de episódios: " + serie.getEpisodios().size());

        serie.getEpisodios()
                .stream()
                .forEach(e -> System.out.println(
                        "Episódio " + e.getNumEpisodio() +
                        " - " + e.getNome()
                ));


        // Reprodução
        System.out.println("\n===== Reproduzir Filme =====");
        filme.iniciar();
        filme.pausar();


        System.out.println("\n===== Reproduzir Série =====");
        serie.iniciarEpisodio(1);
        serie.pausarEpisodio(1);
    }
}
