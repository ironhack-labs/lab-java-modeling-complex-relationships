package com.ModelandoRelacionesComplejas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;




@Data
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate renewal;

    public enum Status {
        ACTIVE, LAPSED
    }

}
