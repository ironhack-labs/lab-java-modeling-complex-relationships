package com.example.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Conference {

    @Id
    private Integer id;
    private Date date;
    private Integer duration;
    private String location;
    private String title;

    @OneToMany
    private List<Guest> conferenceList;

    @Embedded
    Speaker speaker;

    public Conference() {
    }

    public Conference(Integer id, Date date, Integer duration, String location, String title, List<Guest> conferenceList) {
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
        this.conferenceList = conferenceList;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", date=" + date +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", conferenceList=" + conferenceList +
                '}';
    }
}
