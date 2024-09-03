package com.labs.nursesociety.repository;

import com.labs.nursesociety.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {

}
