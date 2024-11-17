package com.example.task1.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity

@Inheritance(strategy= InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String location;
    private LocalDate date;
    private Integer duration;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests = new ArrayList<>();

    public Event(String title, String location, LocalDate date, Integer duration) {
        this.title = title;
        this.location = location;
        this.date = date;
        this.duration = duration;
    }
}
