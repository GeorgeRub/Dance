package com.kindergarten.dance.services;

import com.kindergarten.dance.model.CostumeRequirements;
import com.kindergarten.dance.repositories.CostumeRequirementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumeRequirementsService {

    @Autowired
    private CostumeRequirementsRepository costumeRequirementsRepository;

    public List<CostumeRequirements> findAllActive(){
        return costumeRequirementsRepository.findAllActive();
    }
}
