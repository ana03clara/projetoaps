package com.financeiro.projeto.services;

import com.financeiro.projeto.controller.CategoriaController;
import com.financeiro.projeto.dto.DadosCadastroCategoria;
import com.financeiro.projeto.entities.Categoria;
import com.financeiro.projeto.repositorio.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarServices {
    @Autowired
    private CategoriaRepository repository;
    public Categoria cadastrar(DadosCadastroCategoria dados){
        repository.save(new Categoria(dados));
        return CategoriaController;

    }

}
