package com.kindergarten.dance.repositories;

import com.kindergarten.dance.model.CallBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CallBackRepository extends JpaRepository<CallBack, Long> {
    @Query("select c from CallBack c where c.phone = :phone and c.answered = false")
    CallBack findNotClosedByPhoneNumber(String phone);

    @Query("select c from CallBack c where c.answered = false")
    List<CallBack> getAllNew();
}
