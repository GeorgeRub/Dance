package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
    @Query("select c from Coach c where c.deleted = false")
    List<Coach> findAllActive();
}
