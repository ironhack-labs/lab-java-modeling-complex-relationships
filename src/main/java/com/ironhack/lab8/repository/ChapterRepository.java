package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
