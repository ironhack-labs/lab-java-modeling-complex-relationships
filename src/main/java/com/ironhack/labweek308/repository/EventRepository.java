package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
