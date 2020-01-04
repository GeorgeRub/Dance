package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.OurHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OurHallRepositories extends JpaRepository<OurHall, Long> {
    @Query("select h from OurHall h where h.deleted = false")
    List<OurHall> getAllActive();
}
