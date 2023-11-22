package com.github.crossover.service;

public interface IConverteJsonEmClasse {
    <T> T retornaClasse(String json, Class<T> classe);
}
