package com.ironhack.labweek308.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    private String name;
    private Status status;
    private Date renewalDate;
    @ManyToOne
    private Chapter chapter;

    public enum Status {
        ACTIVE, LAPSED
    }

    public Member(String name, Status status, Date renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", renewalDate=" + renewalDate +
                '}';
    }
}