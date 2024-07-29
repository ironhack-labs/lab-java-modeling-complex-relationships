package com.ironhack.labweek308.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Conference extends Event{

    @OneToOne
    private Speaker speaker;

    @ManyToOne
    private EventManagement eventManagement;



    @Override
    public String toString() {
        return "Conference{" +
                "speaker=" + speaker +
                ", eventManagement=" + eventManagement +
                '}';
    }
}