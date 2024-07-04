package com.example.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Guest {

    @Id
    private Integer id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus guestStatus;

    public Guest() {
    }

    public Guest(Integer id, String name, GuestStatus guestStatus) {
        this.id = id;
        this.name = name;
        this.guestStatus = guestStatus;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuestStatus(GuestStatus guestStatus) {
        this.guestStatus = guestStatus;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guestStatus=" + guestStatus +
                '}';
    }
}
