package com.gestion.GestionCommande.repository;

import com.gestion.GestionCommande.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository <Users, Integer> {

    Users findByMail(String mail);
}
