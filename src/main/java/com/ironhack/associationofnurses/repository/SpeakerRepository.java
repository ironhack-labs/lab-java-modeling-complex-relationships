package com.ironhack.associationofnurses.repository;

import com.ironhack.associationofnurses.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}

