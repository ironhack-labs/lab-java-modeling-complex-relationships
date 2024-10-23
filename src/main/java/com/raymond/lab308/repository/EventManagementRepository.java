package com.raymond.lab308.repository;

import com.raymond.lab308.model.EventManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventManagementRepository extends JpaRepository<EventManagement, String> {
}