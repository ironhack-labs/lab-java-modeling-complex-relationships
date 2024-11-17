package com.example.task1.Service;

import com.example.task1.Model.Exposition;
import com.example.task1.Repositoty.ExpositionRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpositionService {
    private final ExpositionRepository expositionRepository;

    @Transactional
    public Exposition save(Exposition exposition) {
        return expositionRepository.save(exposition);
    }

    public long count() {
        return expositionRepository.count();
    }

    public Optional<Exposition> findById(long id) {
        return expositionRepository.findById(id);
    }
}