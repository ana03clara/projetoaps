package com.financeiro.projeto.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizarPessoas( @NotBlank String nome, Long id,  DadosEndereco endereco) {


}
