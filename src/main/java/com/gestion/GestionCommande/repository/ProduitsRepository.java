package com.gestion.GestionCommande.repository;

import com.gestion.GestionCommande.models.Produits;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitsRepository extends JpaRepository<Produits, Integer> {
	
	Page<Produits> findAll(Pageable pageable);
}
