package com.gestion.GestionCommande.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUITS")
public class Produits {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prix")
   
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
    
    @OneToMany(mappedBy = "produit")
    private List<CommandeProduit> commandeProduits;
}
