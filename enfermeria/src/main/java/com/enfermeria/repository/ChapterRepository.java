package com.enfermeria.repository;

import com.enfermeria.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
