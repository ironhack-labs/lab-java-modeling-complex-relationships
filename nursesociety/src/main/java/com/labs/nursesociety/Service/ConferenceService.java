package com.labs.nursesociety.Service;

import com.labs.nursesociety.model.Conference;
import com.labs.nursesociety.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {

    @Autowired
    private ConferenceRepository conferenceRepository;

    public List<Conference> getAllConferences(){return conferenceRepository.findAll();}

    public Conference createConference(Conference conference){return conferenceRepository.save(conference);}
}
