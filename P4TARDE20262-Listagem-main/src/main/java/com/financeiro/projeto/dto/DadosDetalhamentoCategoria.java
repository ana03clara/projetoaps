package com.financeiro.projeto.dto;

import com.financeiro.projeto.entities.Categoria;

public record DadosDetalhamentoCategoria(
        Long id,
        String name
) {
    public  DadosDetalhamentoCategoria( Categoria categoria){
        this(categoria.getId(), categoria.getName());
    }
}
