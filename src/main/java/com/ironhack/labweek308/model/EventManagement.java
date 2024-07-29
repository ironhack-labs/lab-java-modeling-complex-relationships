package com.ironhack.labweek308.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class EventManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;

    private String name;

    @Override
    public String toString() {
        return "EventManagement{" +
                "name='" + name + '\'' +
                '}';
    }
}