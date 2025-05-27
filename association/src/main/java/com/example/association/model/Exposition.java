package com.example.association.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "expositions")
public class Exposition extends Event{
}
