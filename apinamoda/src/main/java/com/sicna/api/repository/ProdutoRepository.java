package com.sicna.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sicna.api.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
