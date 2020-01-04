package com.kindergarten.dance.services;

import com.kindergarten.dance.repositories.CostumeRequirementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumeRequirementsService {

    @Autowired
    private CostumeRequirementsRepository costumeRequirementsRepository;

}
