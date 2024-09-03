package com.AsociacionEnfermeras.model;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
public class Expositions extends Event {
    private LocalTime expositionsHour;
}
