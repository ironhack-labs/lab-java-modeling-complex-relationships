package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
