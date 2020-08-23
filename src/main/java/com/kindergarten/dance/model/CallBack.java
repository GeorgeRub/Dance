package com.kindergarten.dance.model;

import com.kindergarten.dance.model.auth.User;

import javax.persistence.*;

@Entity
public class CallBack extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String phone;
    @Column
    private boolean answered;
    @Column
    private String talking;

    @ManyToOne
    @JoinColumn(name = "u_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public String getTalking() {
        return talking;
    }

    public void setTalking(String talking) {
        this.talking = talking;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
