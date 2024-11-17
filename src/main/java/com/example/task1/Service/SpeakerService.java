package com.example.task1.Service;

import com.example.task1.Model.Speaker;
import com.example.task1.Repositoty.SpeakerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpeakerService {
    private final SpeakerRepository speakerRepository;

    @Transactional
    public Speaker save(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Transactional
    public void deleteById(Long id) {
        speakerRepository.deleteById(id);
    }

    public Optional<Speaker> findById(Long id) {
        return speakerRepository.findById(id);
    }
}