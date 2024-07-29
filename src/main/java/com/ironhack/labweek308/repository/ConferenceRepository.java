package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
