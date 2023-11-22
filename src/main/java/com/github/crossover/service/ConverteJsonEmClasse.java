package com.github.crossover.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteJsonEmClasse implements IConverteJsonEmClasse {
    ObjectMapper conversorJackson = new ObjectMapper();

    @Override
    public <T> T retornaClasse(String json, Class<T> classe) {
        try {
            return conversorJackson.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
