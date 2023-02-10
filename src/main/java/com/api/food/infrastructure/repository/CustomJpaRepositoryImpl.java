package com.api.food.infrastructure.repository;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.api.food.domain.repository.CustomJpaRepository;

import jakarta.persistence.EntityManager;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomJpaRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID>
	implements CustomJpaRepository<T, ID> {

		
		private EntityManager manager;
		
		public CustomJpaRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, 
				EntityManager entityManager) {
			super(entityInformation, entityManager);
			
			this.manager = entityManager;
		}

		//@Override
		//public Optional<T> buscarPrimeiro() {
			//var jpql = "from " + getDomainClass().getName();
			//
			//T entity = manager.createQuery(jpql, getDomainClass())
			//	.setMaxResults(1)
			//	.getSingleResult();
			//
			//return Optional.ofNullable(entity);
		//}
}
