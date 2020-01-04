package com.kindergarten.dance.services;

import com.kindergarten.dance.model.Coach;
import com.kindergarten.dance.repositories.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;

    public List<Coach> getAllActive() {
        return coachRepository.findAllActive();
    }
}
