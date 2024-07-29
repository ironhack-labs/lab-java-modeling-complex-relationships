package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
