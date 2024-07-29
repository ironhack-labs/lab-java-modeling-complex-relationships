package com.ironhack.labweek308.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class AssociationOfNurses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int associationId;

    private String name;

    @Override
    public String toString() {
        return "AssociationOfNurses{" +
                "name='" + name + '\'' +
                '}';
    }

}
