package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.Inspiration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InspirationRepository extends JpaRepository<Inspiration, Long> {
    @Query("select i from Inspiration i where i.deleted = false order by i.id desc ")
    List<Inspiration> getLastTwo(PageRequest pageRequest);
}
