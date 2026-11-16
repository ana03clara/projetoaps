package com.financeiro.projeto.controller;

import com.financeiro.projeto.dto.DadosCadastroCategoria;
import com.financeiro.projeto.dto.DadosCadastroPessoa;
import com.financeiro.projeto.dto.DadosDetalhamentoCategoria;
import com.financeiro.projeto.services.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("categorias")
public class CategoriaController {
    @Autowired
    public CategoriaService services;

    @PostMapping
    public ResponseEntity<DadosDetalhamentoCategoria> cadastrar (
            @RequestBody
            @Valid DadosCadastroCategoria dados){
            var categoria = services.cadastrar(dados);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body( new DadosDetalhamentoCategoria(categoria));
    }
}
