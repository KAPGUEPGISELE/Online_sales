package com.gestion.GestionCommande.models;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class CommandeProduit {

	@EmbeddedId
	 private CommandeProduitkey id = new CommandeProduitkey();

	    @ManyToOne
	    @MapsId("commandeId")
	    private Commandes commande;

	    @ManyToOne
	    @MapsId("produitId")
	    private Produits produit;

	    private int quantite;
	    private double prixUnitaire;
}
