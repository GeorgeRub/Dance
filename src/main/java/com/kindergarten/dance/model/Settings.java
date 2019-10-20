package com.kindergarten.dance.model;


import javax.persistence.*;

@Entity
@Table(name = "sett")
public class Settings extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "set_id")
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "val")
    private String val;

    public Settings() {
    }

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

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
