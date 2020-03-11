package com.tool.services;

import java.util.Collection;

import com.tool.entity.Commande;

public interface ICommandeService {

	public Commande insert(Commande commande);
	
	public Collection<Commande> findAll();
}
