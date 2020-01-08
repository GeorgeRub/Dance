package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.PageCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageCategoryRepository extends JpaRepository<PageCategory, Long> {
}
