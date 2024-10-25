package com.gestion.GestionCommande.controller;

import com.gestion.GestionCommande.models.Users;
import com.gestion.GestionCommande.repository.UsersRepository;
import com.gestion.GestionCommande.service.UsersService;



import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UsersRepository usersRepository;

    @GetMapping
    public String afficherUtilisateurs(Model model) {
    	 model.addAttribute("users", usersRepository.findAll());
        return "users"; // Retourne la vue "utilisateurs.html"
    }
    }