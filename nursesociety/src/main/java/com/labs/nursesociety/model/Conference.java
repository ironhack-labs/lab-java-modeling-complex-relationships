package com.labs.nursesociety.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Conference extends Event{

    @OneToMany
    private List<Speaker> speakers;
}
