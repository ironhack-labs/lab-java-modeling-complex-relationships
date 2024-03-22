package com.ironhack.EventManagementApplication;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Exposition")
public class Exposition extends Event {
}
