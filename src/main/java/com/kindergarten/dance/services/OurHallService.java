package com.kindergarten.dance.services;

import com.kindergarten.dance.model.OurHall;
import com.kindergarten.dance.repositories.OurHallRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OurHallService {

    @Autowired
    private OurHallRepositories ourHallRepositories;

    public List<OurHall> getAllActive() {
        return ourHallRepositories.getAllActive();
    }
}
