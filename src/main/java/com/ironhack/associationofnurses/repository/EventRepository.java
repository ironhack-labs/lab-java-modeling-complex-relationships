package com.ironhack.associationofnurses.repository;

import com.ironhack.associationofnurses.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}




