package com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.repository;

import com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
}
