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

public class Speaker{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int speakerId;

    private String name;
    private Integer presentationDuration;


    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", presentationDuration=" + presentationDuration +
                '}';
    }
}
