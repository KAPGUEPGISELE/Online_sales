package com.gestion.GestionCommande.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Commandes {

	 @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dateCommande;
	private String statut;
	
	@ManyToOne
	private Users users;
	
	@OneToMany(mappedBy = "commande")
	private List<CommandeProduit> commandeproduit;
}

