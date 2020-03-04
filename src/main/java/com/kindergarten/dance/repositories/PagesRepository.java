package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.pages.Pages;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagesRepository extends JpaRepository<Pages, Long> {

    @Query("select p from Pages p where p.url = :url")
    Pages findByUrl(String url);

    @Query("select  p from Pages p where p.deleted = false and p.pageCategory.id = :catId")
    List<Pages> getAllActiveByCat(Long catId);

    @Query("select  p from Pages p where p.deleted = false and p.pageCategory.id = 1")
    List<Pages> getAllActiveCoaches();

    @Query("select  p from Pages p where p.deleted = false and p.pageCategory.id = 5")
    List<Pages> getAllActiveOurHall();

    @Query("select  p from Pages p where p.deleted = false and p.pageCategory.id = 6")
    List<Pages> getAllActiveInspirations();

    @Query("select n from  Pages n where n.deleted = false and n.pageCategory.id = 4 order by n.id desc ")
    List<Pages> getAllActiveNewslastTwo(Pageable pageable);

    @Query("select p from Pages p where p.deleted = false  and p.showOnIndex = true")
    List<Pages> findAllForIndex();
}
