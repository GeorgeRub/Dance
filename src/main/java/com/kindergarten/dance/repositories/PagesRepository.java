package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.pages.Pages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PagesRepository extends JpaRepository<Pages, Long> {


    @Query("select p from Pages p where p.url = :url")
    Pages findByUrl(String url);
}
