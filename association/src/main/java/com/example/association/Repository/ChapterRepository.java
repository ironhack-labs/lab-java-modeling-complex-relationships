package com.example.association.Repository;


import com.example.association.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository <Chapter, Long> {

}
