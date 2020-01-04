package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.CostumeRequirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumeRequirementsRepository extends JpaRepository<CostumeRequirements, Long> {
}
