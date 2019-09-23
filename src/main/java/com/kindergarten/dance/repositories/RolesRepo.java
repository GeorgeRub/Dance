package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.auth.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepo extends JpaRepository<Roles, Long> {

    @Query("select r from Roles r where r.role = ?1")
    Roles getOneByRole(String role_family);

}
