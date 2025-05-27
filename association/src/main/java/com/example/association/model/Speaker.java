package com.example.association.model;

import jakarta.persistence.*;

@Entity
@Table(name = "speakers")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer presentacionDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    public Speaker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPresentacionDuration() {
        return presentacionDuration;
    }

    public void setPresentacionDuration(Integer presentacionDuration) {
        this.presentacionDuration = presentacionDuration;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }
}
