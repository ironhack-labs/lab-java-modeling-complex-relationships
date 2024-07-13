package com.ironhack.associationofnurses.repository;


import com.ironhack.associationofnurses.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Chapter, Long> {

}





