package com.gestion.GestionCommande.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.GestionCommande.models.Commandes;

@Repository
public interface CommandeRepository extends JpaRepository<Commandes, Integer> {

	Page<Commandes> findAll(Pageable pageable);
}
