package com.kindergarten.dance.services;

import com.kindergarten.dance.model.PageCategory;
import com.kindergarten.dance.repositories.PageCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageCategoryService {

    @Autowired
    private PageCategoryRepository pageCategoryRepository;

    public List<PageCategory> findAll() {
        return pageCategoryRepository.findAll();
    }
}
