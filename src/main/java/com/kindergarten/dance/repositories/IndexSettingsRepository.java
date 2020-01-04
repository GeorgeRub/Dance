package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.IndexSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexSettingsRepository extends JpaRepository<IndexSettings, Long> {
}
