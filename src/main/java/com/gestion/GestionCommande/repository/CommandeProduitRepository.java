package com.gestion.GestionCommande.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.GestionCommande.models.CommandeProduit;
import com.gestion.GestionCommande.models.CommandeProduitkey;

@Repository
public interface CommandeProduitRepository extends JpaRepository<CommandeProduit, CommandeProduitkey> {

}
