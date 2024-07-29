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
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guestId;

    private String name;
    private Status status;

    private enum Status {
        ATTENDING, NOT_ATTENDING, NO_RESPONSE
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}