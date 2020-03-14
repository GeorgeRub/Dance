package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.pages.InnerPagesPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InnerPagesPhotoRepository extends JpaRepository<InnerPagesPhoto, Long> {
}
