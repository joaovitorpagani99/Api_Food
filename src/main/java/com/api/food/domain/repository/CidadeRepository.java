package com.api.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.food.domain.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
