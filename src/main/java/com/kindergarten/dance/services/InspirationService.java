package com.kindergarten.dance.services;

import com.kindergarten.dance.model.Inspiration;
import com.kindergarten.dance.repositories.InspirationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspirationService {

    @Autowired
    private InspirationRepository inspirationRepository;

    public List<Inspiration> getLastTwo() {
        return inspirationRepository.getLastTwo(new PageRequest(0,2));
    }
}
