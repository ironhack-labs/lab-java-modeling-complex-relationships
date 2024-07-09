package com.ironhack.associationofnurses.repository;

import com.ironhack.associationofnurses.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {

}
