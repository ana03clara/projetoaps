package com.financeiro.projeto.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPessoas(
        @NotNull
        String nome,
        Long id,
        DadosEndereco endereco) {


}
