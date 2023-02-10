package com.api.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.food.domain.model.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long>{

}
