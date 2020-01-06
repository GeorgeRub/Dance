package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    @Query("select v from Video v where v.deleted = false")
    List<Video> findAllActive();
}
