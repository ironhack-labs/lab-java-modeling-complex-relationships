package com.enfermeria.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@Entity
public class Conference extends Event {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;
}
