package com.example.task1.Repositoty;

import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
