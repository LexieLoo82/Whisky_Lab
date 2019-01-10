package com.codeclan.example.whiskydistilleries.controllers;

import com.codeclan.example.whiskydistilleries.models.Whisky;
import com.codeclan.example.whiskydistilleries.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/whisky")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value="/whiskiesByYear/{year}")
    public List<Whisky> getWhiskiesByYear(@PathVariable int year){
        return whiskyRepository.getAllWhiskiesByYear(year);
    }

    @GetMapping(value="/whiskiesByRegion/{region}")
    public List<Whisky> getWhiskiesByRegion(@PathVariable String region){
        return whiskyRepository.getAllWhiskiesByRegion(region);
    }

}
