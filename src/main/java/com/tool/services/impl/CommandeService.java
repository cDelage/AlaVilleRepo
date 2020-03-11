package com.tool.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tool.entity.Commande;
import com.tool.repository.ICommandeRepository;
import com.tool.services.ICommandeService;

@Component
public class CommandeService implements ICommandeService{

	@Autowired
	ICommandeRepository commandeRepository;
	
	@Override
	public Commande insert(Commande commande) {
		return commandeRepository.insert(commande);
	}
	
	public Collection<Commande> findAll(){
		return commandeRepository.findAll();
	}

}
