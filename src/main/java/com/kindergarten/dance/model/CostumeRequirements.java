package com.kindergarten.dance.model;

import javax.persistence.*;

@Entity
public class CostumeRequirements extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cr_id")
    private Long id;

}
