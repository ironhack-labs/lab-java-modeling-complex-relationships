package com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.model;

import com.ironhack.labjavamodelingcomplexrelationships.associationofnurses.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table (name = "members")
public class Member {

    // properties
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "member_id")
    private int id;

    @Column (name = "member_name")
    private String name;

    @Enumerated (EnumType.STRING)
    private StatusEnum status;

    private LocalDate renewalDate;

    public Member(String name, StatusEnum status, LocalDate renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

}
