package com.gestion.GestionCommande.service;

import com.gestion.GestionCommande.models.Produits;
import com.gestion.GestionCommande.repository.ProduitsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.util.Optional;

@Service
public class ProduitsService {

	@Autowired
    private ProduitsService produitService;

    @GetMapping
    public Page<Produits> getProduits(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = (Pageable) PageRequest.of(page, size);
        return produitService.findPaginated(pageable);
    }

   
	public Page<Produits> findPaginated(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}




	@PostMapping
    public Produits createProduit(@RequestBody Produits produit) {
        return produitService.save(produit);
    }


	private Produits save(Produits produit) {
		// TODO Auto-generated method stub
		return null;
	}


}