package com.codeclan.example.whiskydistilleries.repositories;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {
    List<Distillery> getDistilleriesByRegion(String region);

    List<Whisky> getWhiskyfromDistilleryByAge(Distillery distillery, int age);
}
