package com.financeiro.projeto.repositorio;

import com.financeiro.projeto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends
        JpaRepository <Categoria, Long>{
}
