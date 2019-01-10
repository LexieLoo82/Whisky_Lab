package com.codeclan.example.whiskydistilleries.projections;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedForWhisky", types = Whisky.class)
public interface EmbedForWhisky {
    String getName();
    Distillery getDistillery();
    int getYear();
    int getAge();
}
