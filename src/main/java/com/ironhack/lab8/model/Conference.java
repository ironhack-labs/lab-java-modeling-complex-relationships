package com.ironhack.lab8.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Conference extends Event{

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
}
