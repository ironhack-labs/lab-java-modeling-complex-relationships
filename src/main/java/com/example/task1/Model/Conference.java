package com.example.task1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jdk.jfr.Event;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity

@PrimaryKeyJoinColumn(name="id")
public class Conference extends Event {

    @OneToMany(mappedBy = "id")
    private List<Speaker> speakers = new ArrayList<>();

    public Conference(String title, String description, LocalDate startDate, LocalDate endDate) {
        super (title, location, date, duration)
    }
}