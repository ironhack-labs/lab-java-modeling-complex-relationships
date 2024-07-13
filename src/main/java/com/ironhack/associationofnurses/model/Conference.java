package com.ironhack.associationofnurses.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Conference extends Event {

    @OneToMany
    private List<Speaker> speakers;

    public Conference() {

    }
}









