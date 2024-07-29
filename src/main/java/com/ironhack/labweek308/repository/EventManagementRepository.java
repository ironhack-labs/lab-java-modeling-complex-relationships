package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.EventManagement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventManagementRepository extends JpaRepository<EventManagement, Integer> {
}
