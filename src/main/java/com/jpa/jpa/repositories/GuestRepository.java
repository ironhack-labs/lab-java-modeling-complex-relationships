package com.jpa.jpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository<Guest> extends JpaRepository<Guest, Long> {
}
