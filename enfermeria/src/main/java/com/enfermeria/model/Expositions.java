package com.enfermeria.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity

public class Expositions extends Event{
    // No tiene propiedades adicionales porque hereda de hereda de Event
}
