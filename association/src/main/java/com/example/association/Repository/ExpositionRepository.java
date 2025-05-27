package com.example.association.Repository;


import com.example.association.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpositionRepository extends JpaRepository<Exposition, Long> {

}