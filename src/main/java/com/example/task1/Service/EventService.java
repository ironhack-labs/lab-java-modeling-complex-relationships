package com.example.task1.Service;

import com.example.task1.Repositoty.EventRepository;
import jakarta.transaction.Transactional;
import jdk.jfr.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    @Transactional
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public long count() {
        return eventRepository.count();
    }
}