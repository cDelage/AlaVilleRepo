package com.tool.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.tool.entity.Commande;

public interface ICommandeRepository extends MongoRepository<Commande, Long> {

	public <S extends Commande> S insert(S entity);

	public <S extends Commande> List<S> findAll(Example<S> example);
	
	
}
