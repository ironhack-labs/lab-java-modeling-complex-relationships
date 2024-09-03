package com.AsociacionEnfermeras.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
public class Conference extends Event {
   private LocalTime conferenceHour;
}
