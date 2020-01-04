package com.kindergarten.dance.services;

import com.kindergarten.dance.model.News;
import com.kindergarten.dance.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getLastTwo() {
        return newsRepository.getLastTwo(new PageRequest(0,2));
    }
}
