package com.jpa.jpa.repositories;


import com.jpa.jpa.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
