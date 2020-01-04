package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.News;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    @Query("select n from  News n where n.deleted = false order by n.id desc ")
    List<News> getLastTwo(Pageable pageable);
}
