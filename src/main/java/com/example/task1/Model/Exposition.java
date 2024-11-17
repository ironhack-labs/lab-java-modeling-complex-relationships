package com.example.task1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Exposition extends Event {

    public Exposition(String title, String location, LocalDate date, Integer duration) {
        super(title, location, date, duration);
    }
}