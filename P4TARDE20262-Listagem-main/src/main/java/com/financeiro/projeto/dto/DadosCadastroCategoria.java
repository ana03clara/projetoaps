package com.financeiro.projeto.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCategoria(
        @NotBlank
        String name
) {
}
