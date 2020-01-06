package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.CostumeRequirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumeRequirementsRepository extends JpaRepository<CostumeRequirements, Long> {
    @Query("select c from CostumeRequirements c where c.deleted = false")
    List<CostumeRequirements> findAllActive();
}
