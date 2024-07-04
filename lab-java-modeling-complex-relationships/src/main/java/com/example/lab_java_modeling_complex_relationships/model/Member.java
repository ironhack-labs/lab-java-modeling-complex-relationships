package com.example.lab_java_modeling_complex_relationships.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Member {

    @Id
    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private Date renewalDate;

    public Member() {
    }

    public Member(String name, MemberStatus status, Date renewalDate) {
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
