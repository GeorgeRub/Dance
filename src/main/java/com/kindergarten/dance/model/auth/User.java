package com.kindergarten.dance.model.auth;

import com.kindergarten.dance.model.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Long id;
    @Column(name = "login", length = 125)
    private String login;
    @Column(length = 25)
    private String name;
    private boolean active;

    @ManyToOne(targetEntity = Roles.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "r_id")
    private Roles role;

    @Column
    private String password;
    @Column
    private boolean enabled;

    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", role=" + role +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
