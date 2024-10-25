package com.gestion.GestionCommande.controller;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.GestionCommande.models.Commandes;
import com.gestion.GestionCommande.service.CommandeService;


@RestController
@RequestMapping("Commandes")
public class CommandeController {

	  @Autowired
	    private CommandeService commandeService;

	  @GetMapping
	    public String getAllCommandes(Model model, @PageableDefault(size = 10) Pageable pageable) {
	        Page<Commandes> commandes = commandeService.listCommandes(pageable);
	        model.addAttribute("commandes", commandes);
	        return "commandes";
	    }

	    @PostMapping("/ajouter")
	    public String ajouterCommande(@ModelAttribute Commandes commande) {
	        commandeService.save(commande);
	        return "redirect:/commandes";
	    }
}
