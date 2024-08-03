package com.ironhack.lab8.repository;

import com.ironhack.lab8.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
