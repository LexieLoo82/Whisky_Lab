package com.codeclan.example.whiskydistilleries.repositories;

import com.codeclan.example.whiskydistilleries.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> getAllWhiskiesByYear (int year);
    List<Whisky> getAllWhiskiesByRegion (String region);
}
