package com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.repository;

import com.ironhack.labjavamodelingcomplexrelationships.eventmanagementapplication.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
}
