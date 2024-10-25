package com.gestion.GestionCommande.controller;

import com.gestion.GestionCommande.models.Produits;
import com.gestion.GestionCommande.service.ProduitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "produits")
public class ProduitsController {
	
	@Autowired
    private  ProduitsService produitsService;

    @GetMapping
    public String afficherProduits(Model model, @RequestParam(defaultValue = "0") int page, 
                                   @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Produits> produitsPage = produitsService.findPaginated(pageable);
        model.addAttribute("produits", produitsPage.getContent());
        model.addAttribute("totalPages", produitsPage.getTotalPages());
        return "produits";
    }
}
