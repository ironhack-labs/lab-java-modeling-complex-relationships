package com.labs.nursesociety.controller;

import com.labs.nursesociety.Service.ConferenceService;
import com.labs.nursesociety.model.Conference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

    @GetMapping
    public List<Conference> getAllConferences() {return conferenceService.getAllConferences(); }

    @PostMapping
    public Conference createConference(@RequestBody Conference conference){return conferenceService.createConference(conference); }
}
