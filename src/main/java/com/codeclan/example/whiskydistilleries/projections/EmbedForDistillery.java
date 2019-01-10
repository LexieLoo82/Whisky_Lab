package com.codeclan.example.whiskydistilleries.projections;

import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="embedForDistillery", types = Distillery.class)
public interface EmbedForDistillery {
    String getName();
    String getRegion();
    List<Whisky> getWhiskies();
}
