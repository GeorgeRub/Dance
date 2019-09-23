package com.kindergarten.dance.services;

import com.kindergarten.dance.model.auth.Roles;
import com.kindergarten.dance.repositories.RolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RolesService {

    @Autowired
    RolesRepo rolesRepo;

    public List<Roles> getAll() {
        return rolesRepo.findAll();
    }

    public Roles getById(Long id) {
        return rolesRepo.getOne(id);
    }

    public Roles getByRole(String role_family) {
        return rolesRepo.getOneByRole(role_family);
    }
}
