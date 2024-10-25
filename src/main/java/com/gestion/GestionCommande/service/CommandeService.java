package com.gestion.GestionCommande.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gestion.GestionCommande.models.Commandes;
import com.gestion.GestionCommande.repository.CommandeProduitRepository;
import com.gestion.GestionCommande.repository.CommandeRepository;
import com.gestion.GestionCommande.repository.ProduitsRepository;
import com.gestion.GestionCommande.repository.UsersRepository;

public class CommandeService {

	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private UsersRepository usersRepository;
	
	  @Autowired
	private ProduitsRepository produitsRepository;
	
	  @Autowired
	private CommandeProduitRepository commandeProduitRepository;
	
	public Page<Commandes> getCommandesPaginees(java.awt.print.Pageable pageable){
		return commandeRepository.findAll(pageable);
		
	}
	

	public Commandes save(Commandes commande) {
		// TODO Auto-generated method stub
		return commandeRepository.save(commande);
	}


	public Page<Commandes> findPaginated(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	public Object ajouterCommande(Commandes commande) {
		// TODO Auto-generated method stub
		return null;
	}



	public Page<Commandes> listCommandes(java.awt.print.Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
