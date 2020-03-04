package com.kindergarten.dance.repositories;


import com.kindergarten.dance.model.Settings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Settings, Long> {

    @Query("select s from Settings s where s.name = :name")
    Settings findByName(String name);

}
