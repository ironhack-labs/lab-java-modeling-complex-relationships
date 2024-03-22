package com.ironhack.EventManagementApplication;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("Conference")
public class Conference extends Event {
    @OneToMany()
    private List<Speaker> speakers;
}
