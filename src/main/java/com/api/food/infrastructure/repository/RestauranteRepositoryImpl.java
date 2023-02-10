package com.api.food.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.api.food.domain.repository.RestauranteRepository;
import com.api.food.domain.repository.RestauranteRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class RestauranteRepositoryImpl  implements RestauranteRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;
	
	@Autowired @Lazy
	private RestauranteRepository restauranteRepository;
	
	//@OVERRIDE
	//PUBLIC LIST<RESTAURANTE> FIND(STRING NOME, 
	//		BIGDECIMAL TAXAFRETEINICIAL, BIGDECIMAL TAXAFRETEFINAL) {
	//	VAR BUILDER = MANAGER.GETCRITERIABUILDER();
		
	//	VAR CRITERIA = BUILDER.CREATEQUERY(RESTAURANTE.CLASS);
		//VAR ROOT = CRITERIA.FROM(RESTAURANTE.CLASS);

	//	VAR PREDICATES = NEW ARRAYLIST<PREDICATE>();
		
		//IF (STRINGUTILS.HASTEXT(NOME)) {
		//	PREDICATES.ADD(BUILDER.LIKE(ROOT.GET("NOME"), "%" + NOME + "%"));
	//	}
		
		//IF (TAXAFRETEINICIAL != NULL) {
	//		PREDICATES.ADD(BUILDER.GREATERTHANOREQUALTO(ROOT.GET("TAXAFRETE"), TAXAFRETEINICIAL));
//		}
		
		//IF (TAXAFRETEFINAL != NULL) {
			//PREDICATES.ADD(BUILDER.LESSTHANOREQUALTO(ROOT.GET("TAXAFRETE"), TAXAFRETEFINAL));
		//}
		
	//	CRITERIA.WHERE(PREDICATES.TOARRAY(NEW PREDICATE[0]));
		//
	//	VAR QUERY = MANAGER.CREATEQUERY(CRITERIA);
	//	RETURN QUERY.GETRESULTLIST();
	//}

	//@Override
	//public List<Restaurante> findComFreteGratis(String nome) {
	//	return restauranteRepository.findAll(RestauranteSpecs.comFreteGratis()
	//			.and(RestauranteSpecs.comNomeSemelhante(nome)));
	//}
}
