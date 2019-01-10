package com.codeclan.example.whiskydistilleries.controllers;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;
import com.codeclan.example.whiskydistilleries.repositories.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/distillery")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;


    @GetMapping(value="/distilleriesByRegion/{region}")
    public List<Distillery> getDistilleriesByRegion(@PathVariable String region){
        return distilleryRepository.getDistilleriesByRegion(region);
    };


    @GetMapping(value="/whiskiesByDistilleryAndAge/{distillery}/{age}")
    public List<Whisky> getWhiskiesByDistilleryAndAge(@PathVariable Distillery distillery, int age){
        return distilleryRepository.getWhiskyfromDistilleryByAge(distillery, age);
    }

}
