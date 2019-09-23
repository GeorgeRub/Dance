package com.kindergarten.dance.model.auth;

import com.kindergarten.dance.model.BaseEntity;

import javax.persistence.*;

@Entity
public class Roles extends BaseEntity {
    @Id
    @Column(name = "r_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    public Roles() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
