package com.api.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.food.domain.model.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{

}
