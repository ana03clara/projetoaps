package com.financeiro.projeto.entities;

import com.financeiro.projeto.dto.DadosCadastroCategoria;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Categoria")
@Table(name = "categoria")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Categoria(DadosCadastroCategoria dados) {

        this.name = dados.name();
    }

//    public void atualizarInformacoes(DadosAtualizacaoCategoria dados) {
//        if (dados.name() != null) {
//            this.name = dados.name();
//        }
//    }
}
