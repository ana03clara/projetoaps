package com.financeiro.projeto.services;

import com.financeiro.projeto.dto.DadosCadastroCategoria;
import com.financeiro.projeto.entities.Categoria;
import com.financeiro.projeto.repositorio.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    @Transactional
    public Categoria cadastrar(DadosCadastroCategoria dados){
        return  repository.save(new Categoria(dados));
    }
}
