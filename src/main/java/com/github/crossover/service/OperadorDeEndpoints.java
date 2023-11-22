package com.github.crossover.service;

public class OperadorDeEndpoints {
    private final ConsomeApiExterna consomeApiExterna = new ConsomeApiExterna();
    private final String ENDERECO_API = "https://www.omdbapi.com/?";
    private final String API_KEY = "apikey=6585022c";

    private final String ENTRE_PARAMETROS = "&";
    private final String PARAMETRO_SERIE = "t=";
    private final String PARAMETRO_TEMPORADA = "season=";


    public String retornaEndpointDeSerie(String nomeDaSerie) {
        String ENDERECO_COM_KEY = ENDERECO_API + API_KEY;
        String ENDPOINT_DE_SERIE = ENDERECO_COM_KEY + ENTRE_PARAMETROS + PARAMETRO_TEMPORADA;
        return ENDPOINT_DE_SERIE + nomeDaSerie;
    }

    public String retornaEndpointDeTemporadaDaSerie(String nomeDaSerie, int numeroDaTemporada) {
        return retornaEndpointDeSerie(nomeDaSerie) + ENTRE_PARAMETROS + PARAMETRO_TEMPORADA + numeroDaTemporada;
    }

    public String retornaEndpointDoEpisodioDaTemporadaDaSerie(String nomeDaSerie, int numeroDaTemporada, int numeroEpisodio) {
        String PARAMETRO_EPISODIO = "episode=";
        return retornaEndpointDeTemporadaDaSerie(nomeDaSerie, numeroDaTemporada) + ENTRE_PARAMETROS + PARAMETRO_EPISODIO + numeroEpisodio;
    }
}
