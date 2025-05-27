package com.example.association.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "conferences")
public class Conference extends Event{
    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speaker> speakers;

    public Conference() {
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
