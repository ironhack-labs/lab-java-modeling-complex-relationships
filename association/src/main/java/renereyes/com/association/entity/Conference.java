package com.renereyes.association.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    // Getters and setters
}
