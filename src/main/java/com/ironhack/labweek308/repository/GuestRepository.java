package com.ironhack.labweek308.repository;

import com.ironhack.labweek308.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
