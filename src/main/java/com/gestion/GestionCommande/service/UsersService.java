package com.gestion.GestionCommande.service;

import com.gestion.GestionCommande.models.Users;
import com.gestion.GestionCommande.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void create(Users users) {
        Users unique = this.usersRepository.findByMail(users.getMail());
        if (unique == null) {
            this.usersRepository.save(users);
        }
    }

    public List<Users> findAllUsers(){
        return this.usersRepository.findAll();
    }

    public Users read(int id) {
        Optional<Users> user = this.usersRepository.findById(id);
        return user.orElse(null);
    }
}
